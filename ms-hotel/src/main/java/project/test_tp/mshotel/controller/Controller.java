package project.test_tp.mshotel.controller;


import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.test_tp.mshotel.entities.Chambre;
import project.test_tp.mshotel.entities.Hotel;
import project.test_tp.mshotel.proxy.ReservationProxy;
import project.test_tp.mshotel.repositories.ChambreRepository;
import project.test_tp.mshotel.repositories.HotelRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class Controller {

    @Resource
    private ChambreRepository chambreRepository;

    @Resource
    private HotelRepository hotelRepository;

    @Resource
    private ReservationProxy reservationProxy;

    @GetMapping("/chambres/{id}/reservations")
    public Chambre show(@PathVariable("id") Long id)
    {
        Optional<Chambre> c = chambreRepository.findById(id);
        if(c.isEmpty()) {
            return null;
        }

        Chambre chambre = c.get();
        chambre.setReservations(reservationProxy.getReservationsByChambre(id));
        return chambre;
    }

    @GetMapping("/hotels/{id}/total_reservations")
    public Long index(@PathVariable("id") Long id)
    {
        Optional<Hotel> h = hotelRepository.findById(id);
        if(h.isEmpty()) {
            return null;
        }

        long count = 0L;
        List<Chambre> chambres = h.get().getChambres();
        for(Chambre c : chambres) {
            count += reservationProxy.getReservationsByChambre(c.getId()).size();
        }
        return count;
    }
}

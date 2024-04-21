package project.test_tp.msreservation.controller;


import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.test_tp.msreservation.DTO.ReservationDTO;
import project.test_tp.msreservation.entities.Reservation;
import project.test_tp.msreservation.repositories.ReservationRepository;

import java.rmi.server.RemoteServer;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class Controller {


    @Resource
    private ReservationRepository reservationRepository;

    @GetMapping("/reservations/chambre/{id}")
    public List<ReservationDTO> show(@PathVariable("id") Long id)
    {
        List<Reservation> data = reservationRepository.getByChambreId(id);
        return data.stream().map(ReservationDTO::new).toList();
    }
}

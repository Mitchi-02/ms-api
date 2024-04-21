package project.test_tp.mshotel.proxy;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import project.test_tp.mshotel.model.ReservationDTO;

import java.util.List;

@FeignClient(name = "ms-reservation")
@LoadBalancerClient(name = "ms-reservation")
public interface ReservationProxy {

    @GetMapping("/api/reservations/chambre/{id}")
    List<ReservationDTO> getReservationsByChambre(@PathVariable("id") Long id);
}

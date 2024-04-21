package project.test_tp.msreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import project.test_tp.msreservation.entities.Reservation;

import java.util.List;

@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> getByChambreId(Long id);
}

package project.test_tp.mshotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import project.test_tp.mshotel.entities.Hotel;

@RepositoryRestResource
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}

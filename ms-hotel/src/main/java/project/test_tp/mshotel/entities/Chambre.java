package project.test_tp.mshotel.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.test_tp.mshotel.model.ReservationDTO;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Chambre {
    @Id
    private Long id;

    private Long number;
    private String type;

    @ManyToOne
    private Hotel hotel;

    @Transient
    private List<ReservationDTO> reservations;
}

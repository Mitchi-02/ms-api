package project.test_tp.msreservation.DTO;

import lombok.Data;
import project.test_tp.msreservation.entities.Reservation;

import java.util.Date;

@Data
public class ReservationDTO {

    public ReservationDTO(Reservation r) {
        this.id = r.getId();
        this.dateDebut = r.getStartDate();
        this.clientName = r.getClient().getName();
    }

    private Long id;

    private Date dateDebut;

    private String clientName;
}

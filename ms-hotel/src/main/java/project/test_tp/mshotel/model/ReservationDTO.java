package project.test_tp.mshotel.model;

import lombok.Data;

import java.util.Date;

@Data
public class ReservationDTO {

    private Long id;

    private Date dateDebut;

    private String clientName;
}

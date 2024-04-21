package project.test_tp.msreservation;

import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.test_tp.msreservation.entities.Client;
import project.test_tp.msreservation.entities.Reservation;
import project.test_tp.msreservation.repositories.ClientRepository;
import project.test_tp.msreservation.repositories.ReservationRepository;

import java.sql.Date;

@SpringBootApplication
public class MsReservationApplication implements CommandLineRunner {

    @Resource
    private ReservationRepository reservationRepository;

    @Resource
    private ClientRepository clientRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsReservationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Client c1 = new Client(1L, "Client1", null);
        Client c2 = new Client(2L, "Client2", null);
        Client c3 = new Client(3L, "Client3", null);

        clientRepository.save(c1);
        clientRepository.save(c2);
        clientRepository.save(c3);

        Reservation r111 = new Reservation(1L, Date.valueOf("2019-01-01"), Date.valueOf("2019-01-01"), c1, 1L);
        Reservation r112 = new Reservation(2L, Date.valueOf("2019-02-01"), Date.valueOf("2019-02-01"), c1, 2L);
        Reservation r113 = new Reservation(3L, Date.valueOf("2019-03-01"), Date.valueOf("2019-03-01"), c1, 3L);

        reservationRepository.save(r111);
        reservationRepository.save(r112);
        reservationRepository.save(r113);

        Reservation r121 = new Reservation(4L, Date.valueOf("2019-04-01"), Date.valueOf("2019-04-01"), c2, 1L);
        Reservation r122 = new Reservation(5L, Date.valueOf("2019-05-01"), Date.valueOf("2019-05-01"), c2, 2L);
        Reservation r123 = new Reservation(6L, Date.valueOf("2019-06-01"), Date.valueOf("2019-06-01"), c2, 3L);

        reservationRepository.save(r121);
        reservationRepository.save(r122);
        reservationRepository.save(r123);

        Reservation r131 = new Reservation(7L, Date.valueOf("2019-07-01"), Date.valueOf("2019-07-01"), c3, 1L);
        Reservation r132 = new Reservation(8L, Date.valueOf("2019-08-01"), Date.valueOf("2019-08-01"), c3, 2L);
        Reservation r133 = new Reservation(9L, Date.valueOf("2019-09-01"), Date.valueOf("2019-09-01"), c3, 3L);

        reservationRepository.save(r131);
        reservationRepository.save(r132);
        reservationRepository.save(r133);
    }
}

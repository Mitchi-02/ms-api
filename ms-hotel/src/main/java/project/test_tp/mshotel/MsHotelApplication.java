package project.test_tp.mshotel;

import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import project.test_tp.mshotel.entities.Chambre;
import project.test_tp.mshotel.entities.Hotel;
import project.test_tp.mshotel.repositories.ChambreRepository;
import project.test_tp.mshotel.repositories.HotelRepository;


@SpringBootApplication
@EnableFeignClients
public class MsHotelApplication implements CommandLineRunner {

	@Resource
	private HotelRepository hotelRepository;

	@Resource
	private ChambreRepository chambreRepository;

	public static void main(String[] args) {
		SpringApplication.run(MsHotelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Hotel h1 = new Hotel(1L, "Hotel1", null);
		Hotel h2 = new Hotel(2L, "Hotel2", null);
		Hotel h3 = new Hotel(3L, "Hotel3", null);

		hotelRepository.save(h1);
		hotelRepository.save(h2);
		hotelRepository.save(h3);

		Chambre c11 = new Chambre(1L, 1L, "Single", h1, null);
		Chambre c12 = new Chambre(2L, 2L, "Double", h1, null);
		Chambre c13 = new Chambre(3L, 3L, "Triple", h1, null);

		chambreRepository.save(c11);
		chambreRepository.save(c12);
		chambreRepository.save(c13);

		Chambre c21 = new Chambre(4L, 1L, "Single", h2, null);
		Chambre c22 = new Chambre(5L, 2L, "Double", h2, null);
		Chambre c23 = new Chambre(6L, 3L, "Triple", h2, null);

		chambreRepository.save(c21);
		chambreRepository.save(c22);
		chambreRepository.save(c23);

		Chambre c31 = new Chambre(7L, 1L, "Single", h3, null);
		Chambre c32 = new Chambre(8L, 2L, "Double", h3, null);
		Chambre c33 = new Chambre(9L, 3L, "Triple", h3, null);

		chambreRepository.save(c31);
		chambreRepository.save(c32);
		chambreRepository.save(c33);
	}
}

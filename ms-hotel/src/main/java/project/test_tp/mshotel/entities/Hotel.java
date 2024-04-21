package project.test_tp.mshotel.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Hotel {
    @Id
    private Long id;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "hotel")
    private List<Chambre> chambres;
}

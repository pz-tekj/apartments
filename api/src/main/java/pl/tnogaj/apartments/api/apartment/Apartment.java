package pl.tnogaj.apartments.api.apartment;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.tnogaj.apartments.api.user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="APARTMENTS")
@Getter
@Setter
@NoArgsConstructor
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private BigDecimal price;
    private Double locationLongitude;
    private Double locationLatitude;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    @ManyToOne
    private User author;
}

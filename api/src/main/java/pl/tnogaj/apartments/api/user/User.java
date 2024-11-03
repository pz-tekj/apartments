package pl.tnogaj.apartments.api.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.tnogaj.apartments.api.apartment.Apartment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDateTime registeredAt;
    private LocalDateTime lastLoginAt;
    private LocalDateTime deletedAt;
    private LocalDate birthday;
    @OneToMany(mappedBy = "author")
    private Set<Apartment> apartments = new HashSet<>();
}

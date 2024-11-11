package pl.tnogaj.apartments.api.apartment;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apartments")
@AllArgsConstructor
public class ApartmentController {
    private final ApartmentRepository apartmentRepository;

    @GetMapping("")
    public Iterable<Apartment> getApartments() {
        System.out.println("getApartments");
        return apartmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Apartment getApartment(@PathVariable Long id) {
        return apartmentRepository.findById(id).orElse(null);
    }
}

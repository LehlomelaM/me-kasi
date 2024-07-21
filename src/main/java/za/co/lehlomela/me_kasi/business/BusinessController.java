package za.co.lehlomela.me_kasi.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController()
@RequestMapping(path = "/business")
public class BusinessController {

    private final BusinessRepository businessRepository;

    @Autowired
    public BusinessController(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    @GetMapping(path = "/{requestedId}")
    public ResponseEntity<Business> findById(@PathVariable Long requestedId) {
        Optional<Business> business = businessRepository.findById(requestedId);

        return business.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    @PostMapping
    public ResponseEntity<Business> save(@RequestBody Business business, UriComponentsBuilder ucb) {

        Business savedBusiness = businessRepository.save(business);
        URI location = ucb.path("business/{id}")
                .buildAndExpand(savedBusiness.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}

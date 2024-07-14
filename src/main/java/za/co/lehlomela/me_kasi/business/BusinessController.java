package za.co.lehlomela.me_kasi.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}

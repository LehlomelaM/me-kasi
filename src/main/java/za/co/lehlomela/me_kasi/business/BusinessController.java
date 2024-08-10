package za.co.lehlomela.me_kasi.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
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

    @GetMapping
    public ResponseEntity<List<Business>> findAll(Pageable pageable) {
        PageRequest pageRequest = PageRequest.of(pageable.getPageNumber(),
                pageable.getPageSize(),
                pageable.getSortOr(Sort.by(Sort.Direction.ASC, "id")));

        Page<Business> page = businessRepository.findAll(pageRequest);
        return ResponseEntity.ok(page.getContent());
    }
}

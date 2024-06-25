package za.co.lehlomela.me_kasi.business;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/business")
public class BusinessController {

    @GetMapping(path = "/{requestedId}")
    public ResponseEntity<Business> findById(@PathVariable Long requestedId) {
        if(requestedId.equals(0L)) return ResponseEntity.notFound().build();

        Business business = new Business();
        business.setId(requestedId);
        business.setEmail("dev@lehlomela.com");
        business.setCategory(Category.RETAIL);

        return ResponseEntity.ok(business);
    }



}

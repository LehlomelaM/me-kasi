package za.co.lehlomela.me_kasi.business;

import org.apache.logging.log4j.util.Strings;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/business")
public class BusinessController {

    @GetMapping(path = "/{requestedId}")
    public ResponseEntity<Business> findById(@PathVariable String requestedId) {
        if (Strings.isNotBlank(requestedId))
            return ResponseEntity.notFound().build();

        Business business = new Business();
        business.setId(requestedId);
        business.setEmail("dev@lehlomela.com");
        business.setCategory(Category.RETAIL);

        return ResponseEntity.ok(business);
    }

}

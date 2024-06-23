package za.co.lehlomela.me_kasi;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BusinessControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void shouldReturnBusinessWhenDataIsSaved() {
        ResponseEntity<String> response = restTemplate.getForEntity("/business/1", String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();


        DocumentContext documentContext = JsonPath.parse(response.getBody());
        String id = documentContext.read("$['id']");
        String email = documentContext.read("$['email']");
        String category = documentContext.read("$['category']");

        assertThat(id).isNotNull();
        assertThat(email).isNotNull();
        assertThat(category).isNotNull();
    }

}

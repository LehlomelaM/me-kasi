package za.co.lehlomela.me_kasi.business;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import za.co.lehlomela.me_kasi.config.DatasourceConfiguration;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest()
public class BusinessRepositoryTest {

    @Autowired
    BusinessRepository repository;

    @Test
    @Disabled
    public void readBusinessWhenDataIsSaved() {
        long businessId = 1L;
        Optional<Business> optionalBusiness = repository.findById(businessId);

        assertThat(optionalBusiness.isPresent()).isTrue();

        Business business = optionalBusiness.get();
        assertThat(business.getId()).isEqualTo(businessId);
        assertThat(business.getName()).isNotNull();
        assertThat(business.getEmail()).isNotNull();
    }


}

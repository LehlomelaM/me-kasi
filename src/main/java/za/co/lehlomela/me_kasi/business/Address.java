package za.co.lehlomela.me_kasi.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
import za.co.lehlomela.me_kasi.common.Province;

@Data
@AllArgsConstructor
public class Address {
    private Long business_id;
    private String street;
    private String city;
    private Province province;
    private String zipCode;
}

package za.co.lehlomela.me_kasi.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/*
 * Lombok
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
/*
 * Spring Data
 */
@Table("BUSINESS")
public class Business {
    @Id
    @With
    private final Long id;
    private String name;
    private String email;
    private String website;
    private String description;
    private String profileImgUrl;
    private String phoneNumber;
//    List<String> photos;
//  private   final Address address;
//    private Category category;
//    List<Review> reviews;
}

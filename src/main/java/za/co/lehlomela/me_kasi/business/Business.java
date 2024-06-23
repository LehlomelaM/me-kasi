package za.co.lehlomela.me_kasi.business;

import lombok.Data;

import java.util.List;

@Data
public class Business {
    // todo: replace Object with relevant type
    private String id;
    private String name;
    private Object address;
    private String phoneNumber;
    private String email;
    private String website;
    private Category category;
    private String description;
    private String imageUrl;
    private List<String> photos;
    private Double averageRating;
    private List<Object> reviews;
}

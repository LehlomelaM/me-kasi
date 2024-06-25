package za.co.lehlomela.me_kasi.common;

import lombok.Getter;

@Getter
public enum Province {
    GP("Gauteng"),
    LP("Limpopo"),
    MP("Mpumalanga"),
    NC("Northern Cape"),
    WC("Western Cape"),
    FS("Free State"),
    KZN("KwaZulu Natal"),
    EC("Eastern Cape"),
    NW("North West");

    private final String name;

    Province(String name) {
        this.name = name;
    }
}

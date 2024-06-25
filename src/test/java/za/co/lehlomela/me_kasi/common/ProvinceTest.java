package za.co.lehlomela.me_kasi.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProvinceTest {

    @Test
    void getName() {
        Province province = Province.GP;
        assertEquals("Gauteng", province.getName());

        province = Province.KZN;
        assertEquals("KwaZulu Natal", province.getName());

        province = Province.LP;
        assertEquals("Limpopo", province.getName());

        province = Province.MP;
        assertEquals("Mpumalanga", province.getName());

        province = Province.EC;
        assertEquals("Eastern Cape", province.getName());

        province = Province.NW;
        assertEquals("North West", province.getName());

        province = Province.FS;
        assertEquals("Free State", province.getName());

        province = Province.NC;
        assertEquals("Northern Cape", province.getName());

        province = Province.WC;
        assertEquals("Western Cape", province.getName());
    }

    @Test
    void values() {
        Province[] provinces = Province.values();
        assertEquals(9, provinces.length);
    }

    @Test
    void valueOf() {
        Province province = Province.valueOf("GP");
        assertEquals(Province.GP, province);

        province = Province.valueOf("KZN");
        assertEquals(Province.KZN, province);

        province = Province.valueOf("LP");
        assertEquals(Province.LP, province);

        province = Province.valueOf("MP");
        assertEquals(Province.MP, province);

        province = Province.valueOf("EC");
        assertEquals(Province.EC, province);

        province = Province.valueOf("NW");
        assertEquals(Province.NW, province);

        province = Province.valueOf("FS");
        assertEquals(Province.FS, province);

        province = Province.valueOf("NC");
        assertEquals(Province.NC, province);

        province = Province.valueOf("WC");
        assertEquals(Province.WC, province);
    }
}
package varnavizsga.jjbvizsga.feladat1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingTest {
    @Test
    void wrongArgument(){
        assertThrows(IllegalArgumentException.class, () -> Billing.priceWithVAT(3,10000));
        assertThrows(IllegalArgumentException.class, () -> Billing.priceWithoutVAT(3,10000));
    }

    @Test
    void priceWithVAT() {
        assertEquals(12700, Billing.priceWithVAT(27, 10000));
        assertEquals(13108, Billing.priceWithVAT(18, 11108));
        assertEquals(11667, Billing.priceWithVAT(5, 11111));
    }

    @Test
    void priceWithoutVAT() {
        assertEquals(7874, Billing.priceWithoutVAT(27, 10000));
        assertEquals(8474, Billing.priceWithoutVAT(18, 10000));
        assertEquals(9523, Billing.priceWithoutVAT(5, 10000));
    }

    @Test
    void displayBook() {
        assertEquals("Gipsz Jakab - Este a vadonban                      Áfával: 10000 Ft, Áfa nélkül:  9523 Ft"
                , Billing.displayBook("Gipsz Jakab", "Este a vadonban", 10000));
        assertEquals("Teszt Elek - Reggel a bányában                     Áfával:  4000 Ft, Áfa nélkül:  3809 Ft"
                , Billing.displayBook("Teszt Elek", "Reggel a bányában", 4000));
    }
}
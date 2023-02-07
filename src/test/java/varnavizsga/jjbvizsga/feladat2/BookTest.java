package varnavizsga.jjbvizsga.feladat2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book1;
    Book book2;

    @BeforeEach
    void setUp() {
        book1 = new Book(1,"Gipsz Jakab", "Este a vadonban", 10000, false);
        book2 = new Book(2,"Teszt Elek", "Reggel a bányában", 4000, true);
    }

    @Test
    void onSaleProperty() {
        assertFalse(book1.isOnSale());
        assertTrue(book2.isOnSale());
        book1.setOnSale(true);
        book2.setOnSale(false);
        assertTrue(book1.isOnSale());
        assertFalse(book2.isOnSale());
    }

    @Test
    void getCurrentPrice() {
        assertEquals(10000, book1.getCurrentPrice());
        assertEquals(3400, book2.getCurrentPrice());
    }

    @Test
    void testToString() {
        assertEquals("Gipsz Jakab - Este a vadonban: 10000 Ft", book1.toString());
        assertEquals("Teszt Elek - Reggel a bányában: 3400 Ft", book2.toString());
    }
}
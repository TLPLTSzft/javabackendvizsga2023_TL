package varnavizsga.jjbvizsga.feladat3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {
    BookManager manager;

    @BeforeEach
    void setUp() {
        manager = new BookManager();
    }

    @Test
    void getBookCount() {
        addBooks();
        assertEquals(2, manager.getBookCount());
        addMoreBooks();
        assertEquals(5, manager.getBookCount());
    }

    @Test
    void getTotalPrice() {
        addBooks();
        assertEquals(14000, manager.getTotalPrice());
        addMoreBooks();
        assertEquals(32500, manager.getTotalPrice());
    }

    @Test
    void countOnSale() {
        addBooks();
        assertEquals(1, manager.countOnSale());
        addMoreBooks();
        assertEquals(2, manager.countOnSale());
    }

    void addBooks() {
        manager.addBook(1,"Gipsz Jakab", "Este a vadonban", 10000, false);
        manager.addBook(2,"Teszt Elek", "Reggel a bányában", 4000, true);

    }

    void addMoreBooks() {
        manager.addBook(3,"Gipsz Jakab", "Az utazás", 6000, false);
        manager.addBook(4,"Teszt Elek", "Érdekes találkozások", 5000, false);
        manager.addBook(5,"Gipsz Jakab", "Vad szerelem", 7500, true);
    }
}
package varnavizsga.jjbvizsga.feladat4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookReaderTest {
    BookReader reader;

    @BeforeEach
    void setUp() {
        reader = new BookReader();
        reader.readBooksFromFile("forrasok/books.csv");
    }

    @Test
    void countOnSale() {
        assertEquals(6, reader.countOnSale());
    }

    @Test
    void getCheapest() {
        assertEquals("Id Voluptas Omnis", reader.getCheapest());
    }
}
package varnavizsga.jjbvizsga.feladat5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseTest {
    BookDatabase database;

    @BeforeEach
    void setUp() {
        database = new BookDatabase();
        database.truncateBooksTable();
        database.addBook("Jaida Nitzsche","Quo Animi Quia Eveniet Aut",13434,false);
        database.addBook("Ardella Bauch","Eum Magni Fugit",13213,true);
        database.addBook("Kyla Kertzmann III","Id Voluptas Omnis",3401,true);
        database.addBook("Briana Kihn","Saepe Totam Magnam Sit",10398,true);
        database.addBook("Ardella Bauch","Voluptatum Sit Quia",13099,true);
        database.addBook("Dr. Judah Armstrong IV","Ratione Quo",5618,false);
        database.addBook("Sabina O'Connell","Voluptates Accusamus Est Vitae",6427,true);
        database.addBook("Asha Kreiger","Nesciunt Sed Est Enim",9965,true);
        database.addBook("Mrs. Mozelle Nader","Aut Ad Aut",5690,false);
        database.addBook("Sabina O'Connell","Repellendus Ut Mollitia Quo",5235,false);
        database.addBook("Briana Kihn","Veritatis Consectetur",12675,true);
        database.addBook("Sabina O'Connell","Libero Quia",3296,false);
        database.addBook("Asha Kreiger","Quia Nulla Eum Quo",12424,true);
        database.addBook("Kyla Kertzmann III","Non Consectetur Ut",6715,true);
        database.addBook("Briana Kihn","Velit Modi",2483,false);
        database.addBook("Asha Kreiger","Quibusdam Cumque Perspiciatis Sed Nihil",9713,false);
        database.addBook("Kyla Kertzmann III","Cupiditate Libero",3271,false);
        database.addBook("Briana Kihn","Vel Amet Eum Suscipit Earum",8813,false);
        database.addBook("Prof. Jon Armstrong I","Veniam Placeat Omnis Voluptas Deleniti",6628,true);
        database.addBook("Asha Kreiger","Sed Ipsa",7765,true);
    }

    @Test
    void getAllBookTitle() {
        List<String> actualTitles = database.getAllBookTitle();
        List<String> expectedTitles = new ArrayList<>();
        expectedTitles.add("Quo Animi Quia Eveniet Aut");
        expectedTitles.add("Eum Magni Fugit");
        expectedTitles.add("Id Voluptas Omnis");
        expectedTitles.add("Saepe Totam Magnam Sit");
        expectedTitles.add("Voluptatum Sit Quia");
        expectedTitles.add("Ratione Quo");
        expectedTitles.add("Voluptates Accusamus Est Vitae");
        expectedTitles.add("Nesciunt Sed Est Enim");
        expectedTitles.add("Aut Ad Aut");
        expectedTitles.add("Repellendus Ut Mollitia Quo");
        expectedTitles.add("Veritatis Consectetur");
        expectedTitles.add("Libero Quia");
        expectedTitles.add("Quia Nulla Eum Quo");
        expectedTitles.add("Non Consectetur Ut");
        expectedTitles.add("Velit Modi");
        expectedTitles.add("Quibusdam Cumque Perspiciatis Sed Nihil");
        expectedTitles.add("Cupiditate Libero");
        expectedTitles.add("Vel Amet Eum Suscipit Earum");
        expectedTitles.add("Veniam Placeat Omnis Voluptas Deleniti");
        expectedTitles.add("Sed Ipsa");
        assertEquals(expectedTitles, actualTitles);
    }

    @Test
    void getTotalPrice() {
        assertEquals(160263, database.getTotalPrice());
    }
}
package varnavizsga.jjbvizsga.feladat4;

import varnavizsga.jjbvizsga.feladat2.Book;
import varnavizsga.jjbvizsga.feladat3.BookManager;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookReader {
	ArrayList<Book> books = new ArrayList<>();
	
	public void readBooksFromFile(String fileName) {
		try {
			books.clear();
			String fnev = "./forrasok/books.csv";
			FileReader fr = new FileReader(fnev);
			Scanner sc = new Scanner(fr);
			sc.nextLine();
			while (sc.hasNext()) {
				String[] seged = sc.nextLine().split(";");
				books.add(new Book(Integer.parseInt(seged[0]), seged[1], seged[2], Integer.parseInt(seged[3]), Integer.parseInt(seged[4]) == 1 ? true : false));
			}
			fr.close();
		} catch (Exception e) {
			System.err.println("\nHIBA a beolvasás során:\n");
		}
	}
	
	public int countOnSale() {
		int akciosKonyvekDarabszama = 0;
		for (Book book : books) {
			if (book.isOnSale()) {
				akciosKonyvekDarabszama++;
			}
		}
		return akciosKonyvekDarabszama;
	}
	
	public String getCheapest() {
		String legolcsobbKonyvCime = "";
		int legolcsobbKonyvAra = books.get(0).getPrice();
		for (int i = 1; i < books.size(); i++) {
			if (books.get(i).getPrice() < legolcsobbKonyvAra) {
				legolcsobbKonyvCime = books.get(i).getTitle();
			}
		}
		return legolcsobbKonyvCime;
	}
}

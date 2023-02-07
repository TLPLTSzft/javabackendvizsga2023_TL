package varnavizsga.jjbvizsga.feladat3;

import varnavizsga.jjbvizsga.feladat2.Book;

import java.util.ArrayList;

public class BookManager {
	private ArrayList<Book> books = new ArrayList<>();
	
	public void addBook(int id, String author, String title, int price, boolean onSale) {
		books.add(new Book(id, author, title, price, onSale));
	}
	
	public int getBookCount() {
		return books.size();
	}
	
	public long getTotalPrice() {
		int eltaroltKonyvekOsszesAra = 0;
		for (Book book : books) {
			eltaroltKonyvekOsszesAra += book.getCurrentPrice();
		}
		return eltaroltKonyvekOsszesAra;
	}
	
	public int countOnSale() {
		int akciosKonyvekDarabszama=0;
		for (Book book : books) {
			if (book.isOnSale()){
				akciosKonyvekDarabszama++;
			}
		}
		return akciosKonyvekDarabszama;
	}
}

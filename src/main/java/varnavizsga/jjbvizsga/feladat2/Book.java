package varnavizsga.jjbvizsga.feladat2;

public class Book {
	private int id;
	private String author;
	private String title;
	private int price;
	private boolean onSale;
	
	public int getId() {
		return id;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public Book(int id, String author, String title, int price, boolean onSale) {
	}
	
	public boolean isOnSale() {
		return true;
	}
	
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
	
	public int getCurrentPrice() {
		if (onSale) {
			return getPrice();
		} else {
			return (int) Math.floor(getPrice() - getPrice() * 15 / 100.0);
		}
	}
	
	@Override
	public String toString() {
		String string = String.format("%-50s: %5d", this.author + " - " + this.title, getCurrentPrice());
		return string;
	}
}

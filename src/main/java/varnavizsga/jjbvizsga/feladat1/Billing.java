package varnavizsga.jjbvizsga.feladat1;

public class Billing {
	
	public static int priceWithVAT(int vatRate, int priceWithoutVAT) {
		int priceWithVAT = 0;
		try {
			if (vatRate == 5 || vatRate == 18 || vatRate == 27) {
				priceWithVAT = (int) Math.ceil(priceWithoutVAT * (1 + vatRate / 100.0));
			}
		} catch (IllegalArgumentException e) {
//		} catch (Exception e) {
			System.err.println("\nÉrvénytelen áfakulcs:\n" + e);
		}
		return priceWithVAT;
	}
	
	public static int priceWithoutVAT(int vatRate, int priceWithVAT) {
		int priceWithoutVAT = 0;
		try {
			if (vatRate == 5 || vatRate == 18 || vatRate == 27) {
				priceWithoutVAT = (int) Math.floor(priceWithVAT / (1 + vatRate / 100.0));
			}
//		} catch (Exception e) {
		} catch (IllegalArgumentException e) {
			System.err.println("\nÉrvénytelen áfakulcs:\n" + e);
		}
		return priceWithoutVAT;
	}
	
	public static String displayBook(String author, String title, int priceWithVAT) {
		String string = String.format("%-50s Áfával: %5d Ft,Áfa nélkül: %5d Ft", author + " - " + title, priceWithVAT, priceWithoutVAT(5, priceWithVAT));
		return string;
	}
}

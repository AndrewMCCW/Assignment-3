import java.util.*;
public class Client {
	
	public static void main (String [] args)
	{
		Scanner reader = new Scanner (System.in);
		String date; 
		
		PurchasedItems p = new PurchasedItems(); 
		ReceiptFactory r = new ReceiptFactory();
		r.setState("MD");
		
		//adds items to purchased items list
		p.addItem(new StoreItem("100", "Sony TV", 999.00));
		p.addItem(new StoreItem("101", "Sony PlayStation X", 299.00));
		p.addItem(new StoreItem("102", "Dell XPS 13 Laptop", 1099.00));
		p.addItem(new StoreItem("103", "Alienware Aurora Desktop", 1599.99));
		p.addItem(new StoreItem("104", "Bose Home Entertainment System", 2999.00));
		
		System.out.println("What is today's date? (MM/DD/YYYY)");
		date = reader.nextLine();
		
		String day = date.substring(3, 5);
		String month = date.substring(0, 2);
		String year = date.substring(6, 9) + date.substring(9);
		
		
		ReceiptDate d = new ReceiptDate();
		d.setDay(day);
		d.setMonth(month);
		d.setYear(year);
		d.setDate();
		Receipt receipt = r.getReceipt(p, d);
		receipt.prtReceipt();
	}
}

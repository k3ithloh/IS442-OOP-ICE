import java.util.*;
public class ProductReportCreator{
	
	// Implement the method here

	public static void main(String[] args) {
		ElectronicProduct p1 = new Laptop("T1001","Fujitsu",2007,2500.0,"Windows",2.40,6,true);
		ElectronicProduct p2 = new Computer("T1003","IBM",2008,2000.0,"Windows",2.40);
		ElectronicProduct p3 = new Computer("T1004","IBM",2000,1500.0,"Windows",1.40);
		ArrayList<ElectronicProduct> products = new ArrayList<ElectronicProduct>();
		products.add(p1);
		products.add(p2);
		products.add(p3);

		// If you haven't implemented Printer and DigitalCamera comment out the following four lines
		ElectronicProduct p4 = new Printer("T1005", "Epson", 2009, 1000.0, 50, true, true);
		ElectronicProduct p5 = new DigitalCamera("T1006", "Samsung", 2008, 500.0, 10, 10, 5);
		products.add(p4);
		products.add(p5);
		
		ProductReportCreator.createReport(products);
	}
	
}
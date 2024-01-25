import java.util.*;
public class TaxCalculatorTest{
	public static void main(String[] args) {
		TaxableProduct p1 = new Laptop("T1001","Fujitsu",2007,2500.0,"Windows",2.40,6,true);
		TaxableProduct p2 = new Computer("T1003","IBM",2008,2000.0,"Windows",2.40);
		TaxableProduct p3 = new Computer("T1004","IBM",2000,1500.0,"Windows",1.40);
		ArrayList<TaxableProduct> products = new ArrayList<TaxableProduct>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		// Comment out the following lines if you did not implement Printer and DigitalCamera
		// Note that the answer in the lecture slides would be different
		TaxableProduct p4 = new Printer("T1005","Epson",2009,1000.0,50,true,true);
		TaxableProduct p5 = new DigitalCamera("T1006","Samsung",2008,500.0,10,10,5);
		products.add(p4);
		products.add(p5);
		
		double totalPayableTax = TaxCalculator.calculateTotalPayableTax(products);
		System.out.println("The total tax is $" + totalPayableTax);
	}
}
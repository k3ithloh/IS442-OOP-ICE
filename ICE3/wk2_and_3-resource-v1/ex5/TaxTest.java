public class TaxTest {
	public static void main(String[] args) {
		Laptop l = new Laptop("T1001","Fujitsu",2007,2500.0,"Windows",2.40,6,true);
		System.out.println("The tax for a $" + l.getPrice() + " laptop is $" + l.computeTax());
	}
}
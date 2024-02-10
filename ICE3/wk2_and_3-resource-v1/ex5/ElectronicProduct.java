public class ElectronicProduct implements TaxableProduct{
	private String name;
	private String company;
	private int manufacturedYear;
	private double price;
	
	public ElectronicProduct(String name, String company, int manufacturedYear, double price) {
		this.name = name;
		this.company = company;
		this.manufacturedYear = manufacturedYear;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCompany() {
		return company;
	}
	
	public int getManufacturedYear() {
		return manufacturedYear;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double computeTax(){
		return price*0.07;
	}
	
	public String toString() {
		return "Name=" + name + ",Company=" + company + ",ManufacturedYear=" + manufacturedYear + ",Price=" + price;
	}
}
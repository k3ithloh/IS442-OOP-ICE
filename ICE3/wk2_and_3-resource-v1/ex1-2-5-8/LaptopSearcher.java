import java.util.*;
public class LaptopSearcher{
	//Implement the method here
	public static ArrayList<Laptop> getNewWindowsBasedLongBatteryLifeTablet(ArrayList<Laptop> laptops){
		ArrayList<Laptop> filteredLaptops = new ArrayList<>();
		for (Laptop laptop : laptops){
			if (laptop.getManufacturedYear() > 2008 && "Windows".equalsIgnoreCase(laptop.getOperatingSystem()) && laptop.getBatteryLife() > 5 && laptop.getTablet()){
				// System.out.println(laptop.getName());
				filteredLaptops.add(laptop);
			}
		}
		return filteredLaptops;
	}
	
	public static void main(String[] args) {
		Laptop l1 = new Laptop("T1001","Fujitsu",2009,2500.0,"Windows",2.40,6,true);
		Laptop l2 = new Laptop("T1002","Fujitsu",2006,1800.0,"Windows",2.40,6,false);
		Laptop l3 = new Laptop("T1003","IBM",2009,2000.0,"Windows",2.40,7,true);
		Laptop l4 = new Laptop("T1004","IBM",2000,1500.0,"Windows",1.40,4,false);
		Laptop l5 = new Laptop("T1005","IBM",2000,1200.0,"Linux",1.40,4,false);
		ArrayList<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(l1);
		laptops.add(l2);
		laptops.add(l3);
		laptops.add(l4);
		laptops.add(l5);
		ArrayList<Laptop> result = LaptopSearcher.getNewWindowsBasedLongBatteryLifeTablet(laptops);
		for (Laptop l: result) {
			System.out.println(l.getName());
		}
	}
}
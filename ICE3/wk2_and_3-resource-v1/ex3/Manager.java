public class Manager extends Employee{
	public double allowance;
	public Manager(String name, double baseSalary, double allowance) {
		super(name,baseSalary);
		this.allowance = allowance;
	}

	// Implement the method here
	
	public String toString() {
		return super.toString() + ",allowance=" + allowance;
	}
}
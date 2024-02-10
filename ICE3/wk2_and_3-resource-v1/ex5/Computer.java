// Derived class for computers
public class Computer extends ElectronicProduct {
    private String operatingSystem;
    private double cpuSpeed;

    // Constructor
    public Computer(String name, String company, int manufacturedYear, double price, String operatingSystem, double cpuSpeed) {
        super(name, company, manufacturedYear, price);
        this.operatingSystem = operatingSystem;
        this.cpuSpeed = cpuSpeed;
    }

    // Getters and setters for each field
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    //for ex 8
    @Override
    public String toString() {
        return super.toString() +
               ", operatingSystem='" + operatingSystem + '\'' +
               ", cpuSpeed=" + cpuSpeed;
    }
}
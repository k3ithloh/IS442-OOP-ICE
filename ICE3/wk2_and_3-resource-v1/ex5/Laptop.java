// Derived class for laptops, which is a type of computer
public class Laptop extends Computer {
    private int batteryLife;
    private boolean tablet;

    // Constructor
    public Laptop(String name, String company, int manufacturedYear, double price, String operatingSystem, double cpuSpeed, int batteryLife, boolean tablet) {
        super(name, company, manufacturedYear, price, operatingSystem, cpuSpeed);
        this.batteryLife = batteryLife;
        this.tablet = tablet;
    }

    // Getters and setters for each field
    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isTablet() {
        return tablet;
    }

    public void setTablet(boolean tablet) {
        this.tablet = tablet;
    }

    //for ex 8
    @Override
    public String toString() {
        return super.toString() +
               ", batteryLife=" + batteryLife +
               ", isTablet=" + tablet;
    }
}
// package ICE3.ice3-resource.Q2;

public class Vehicle {
    private int numWheels;
    private double distancePerLiter;

    public Vehicle(int numWheels, double distancePerLiter) {
        this.numWheels = numWheels;
        this.distancePerLiter = distancePerLiter;
    }

    public String toString() {
        return "Vehicle[numWheels=<" + this.numWheels + ">, distancePerLiter=<" + this.distancePerLiter + ">]";
    }
}

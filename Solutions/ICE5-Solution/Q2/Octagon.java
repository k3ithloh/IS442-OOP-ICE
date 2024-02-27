public class Octagon implements Shape {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public double getArea() {
        return Math.pow(side, 2) * (2 + 2 * Math.sqrt(2));
    }

    public double getPerimeter() {
        return side * 8;
    }


    public String toString() {
        return String.format("%s[side = %.1f]", getClass().getName(), side);
    }
}
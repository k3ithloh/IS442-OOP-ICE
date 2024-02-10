public class Octagon implements Shape{
  private double side;

  public Octagon(double side){
    this.side = side;
  }

  public double getSide(){
    return this.side;
  }

  public double getArea(){
    return Math.pow(side,2) * (2 + 2 * Math.sqrt(2));
  }

  public double getPerimeter(){
    return 8 * this.side;
  }

  public String toString(){
    return String.format("An octagon whose side is %d will have an area and perimeter of %.2f and %d respectively.", Math.round(side),getArea(),Math.round(getPerimeter()));
  }
}

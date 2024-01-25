public class Soldier {
  private String name;
  private double baseAllowance;

  public Soldier(String name, double baseAllowance){
    this.name = name;
    this.baseAllowance = baseAllowance;
  }

  public String getName(){
    return this.name;
  }

  public double getBaseAllowance(){
    return this.baseAllowance;
  }

  public double getGrossAllowance(){
    return this.baseAllowance;
  }

  public String toString(){
    return "Soldier {name='" + getName() +"', baseAllowance=" + getBaseAllowance() + "}" ; 
  }

}

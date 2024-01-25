public class Commando extends Soldier{
  private double vocationAllowance;

  public Commando (String name, double baseAllowance, double vocationAllowance){
    super(name, baseAllowance);
    this.vocationAllowance = vocationAllowance;
  }

  public double getGrossAllowance(){
    return super.getGrossAllowance() + this.vocationAllowance;
  }

  public string toString(){
    return super.toString();
  }

}

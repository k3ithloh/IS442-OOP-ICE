public class Commando extends Soldier {
    private double vocationAllowance;

    public Commando(String name, double baseAllowance, double vocationAllowance) {
        super(name, baseAllowance);
        this.vocationAllowance = vocationAllowance;
    }

    @Override
    public double getGrossAllowance() {
        return getBaseAllowance() + vocationAllowance;
    }

    @Override
    public String toString() {
        return String.format("Commando{%s, vocationAllowance=%.1f}", super.toString(), vocationAllowance);
    }
}

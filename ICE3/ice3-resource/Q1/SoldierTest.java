/**
 * Created by yeowleong on 26/4/16.
 */
public class SoldierTest {
    public static void main(String[] args) {
        Commando c = new Commando("Peter", 5000, 200);
        Soldier s = new Soldier("John", 3000);

        System.out.println(c);
        System.out.println(s);

        System.out.println("Commando's base allowance : " + c.getBaseAllowance());
        System.out.println("Commando's gross allowance : " + c.getGrossAllowance());
        System.out.println("Soldier's base allowance : " + s.getBaseAllowance());
        System.out.println("Soldier's gross allowance : " + s.getGrossAllowance());

        // Commando{Soldier {name='Peter', baseAllowance=5000.0},
        // vocationAllowance=200.0}
        // Soldier {name='John', baseAllowance=3000.0}
        // Commando's base allowance is 5000.0
        // Commando's gross allowance is 5200.0

        // Soldier's base allowance is 3000.0
        // Soldier's gross allowance is 3000.0

    }
}

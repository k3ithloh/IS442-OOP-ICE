import java.util.Scanner;

public class CashRegisterTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        CashRegister creg = new CashRegister();

        System.out.print("Enter the price of first item: $");
        double firstPrice = sc.nextDouble();
        System.out.print("Enter the price of second item: $");
        double secondPrice = sc.nextDouble();

        System.out.println();

        creg.registerPurchase(firstPrice + secondPrice);

        System.out.print("Enter dollars received from customer: ");
        int dollarsReceived = sc.nextInt();
        System.out.print("Enter cents received from customer: ");
        int centsReceived = sc.nextInt();

        System.out.println();

        creg.makePayment(dollarsReceived, centsReceived);

        System.out.printf("Total cost of purchase: $%.2f\n", creg.getPurchaseAmount());
        System.out.printf("Change due: $%.2f\n", creg.giveChange());
    }
}

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number:");
        int number = sc.nextInt();

        String output = "";
        int product = 1;

        while (number >= 0) {
            product *= number;
            output += " x " + number ;
        
            // prompt again
            System.out.print("Enter number:");
            number = sc.nextInt();
        }

        if (output.isEmpty()) {
            System.out.println("No positive number is entered");
        } else {
            output = output.substring(3);    //the first x has to be removed
            System.out.println(output + " = " + product);
        }
    }
}
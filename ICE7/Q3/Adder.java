import java.util.Scanner;
import java.util.InputMismatchException;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getNumber(scanner, "Enter the first number: ");
        int num2 = getNumber(scanner, "Enter the second number: ");

        int sum = num1 + num2;
        System.out.println("The answer is " + sum);

        scanner.close();
    }

    public static int getNumber(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                scanner.next(); //! Discard invalid input
            }
        }
    }
} 
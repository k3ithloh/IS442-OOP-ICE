import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1> ");
        int num1 = sc.nextInt();

        System.out.println();
        System.out.print("Enter num 2> ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println();
        System.out.println("The answer is " + sum);
    }
}
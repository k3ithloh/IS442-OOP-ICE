import java.util.Scanner;

public class Q8BinaryConverter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Prompt for decimal number
    System.out.print("Enter decimal number: ");
    int number = sc.nextInt();

    // Convert from int number from decimal to binary
    String binary = Integer.toBinaryString(number);
    System.out.printf("Binary equivalent of %d is %s", number, binary);
  }
}

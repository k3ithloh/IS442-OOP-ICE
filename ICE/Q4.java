import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
   int num = 0;
   String input = "";
   int product = 1;
   Scanner sc = new Scanner(System.in);
   
  //  do so that the loop will run at least once
   do {
    System.out.print("Enter number:");
    num = sc.nextInt();
    // if this is the first input and the number is positive
    if (num>=0 && input.length() == 0){
      input += num;
      product *= num;
    }
    // if this is not the first input and the number is positive
    else if (num>=0){
      input += " X " + num;
      product *= num;
    }
  // escape from the while loop if num input is negative
   } while (num>=0);
  // close the scanner to prevent memory leak
   sc.close();
  //  if there has been no input and the num is negative
   if (input.length() == 0 && num < 0){
     System.out.println("No positive number is entered");
    }
    else{
      input += " = " + product;
    System.out.println(input);
    }
  }
}
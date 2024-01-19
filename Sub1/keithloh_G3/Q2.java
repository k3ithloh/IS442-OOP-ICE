import java.util.*;

public class Q2 {
  public static void main(String[] args ){
    boolean match = false;
    while (!match){
      Scanner fInput = new Scanner(System.in);
      System.out.println("Enter first word:");
      
      String fWord = fInput.next();

      Scanner sInput = new Scanner(System.in);
      System.out.println("Enter second word:");

      String sWord = sInput.next();
      char fFirstChar = fWord.charAt(0);
      char sFirstChar = sWord.charAt(0);

      if (fFirstChar == sFirstChar){
        match = true;
        System.out.println("Bingo");
      } else{
        System.out.println("try again");
      }
      fInput.close();
      sWord.close();
    }
  }
  
}
import java.io.*;
import java.util.Scanner;

public class ReadNumbers {
  public static void main(String[] args) {
    readNumbers();
  }

  public static void readNumbers(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter filename> ");
    String fileName = sc.nextLine();
    File file = new File(fileName);
    try {
      Scanner fileIn = new Scanner(file); 
      int totalCount = 0;
      while (fileIn.hasNext()){
      int currentInt = fileIn.nextInt();
      // System.out.println(currentInt); 
      totalCount += currentInt;
    }
    fileIn.close();
    System.out.printf("The sum is %d", totalCount);
    System.out.println();
    }
    catch(FileNotFoundException e) {
      System.out.printf("%s is invalid",fileName);
      System.out.println();
      readNumbers();
    }
    sc.close();
  }
}

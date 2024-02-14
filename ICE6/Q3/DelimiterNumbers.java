import java.io.*;
import java.util.Scanner;

public class DelimiterNumbers {
  public static void main(String[] args) {
    readDelimiterNumbers();
  }

  public static void readDelimiterNumbers(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter filename> ");
    String fileName = sc.nextLine();
    File file = new File(fileName);
    try {
      
      Scanner fileScanner = new Scanner(file);
      
      while (fileScanner.hasNextLine()){
        String line = fileScanner.nextLine();
        Scanner lineScanner = new Scanner(line);
        lineScanner.useDelimiter(",");

        int sum = 0;
        while(lineScanner.hasNextInt()){
          sum += lineScanner.nextInt();
        }

      System.out.println(sum);
      lineScanner.close();
    }
    fileScanner.close();
    }
    catch(FileNotFoundException e) {
      System.out.printf("%s is invalid",fileName);
      System.out.println();
      readDelimiterNumbers();
    }
    sc.close();
  }
}

import java.io.*;
import java.util.Scanner;

public class TextFileReader {

  public static void main(String[] args) {
    long start = System.currentTimeMillis();

    String fileNameAndPath = "data/students.txt";
    try {
      Scanner sc = new Scanner(new File(fileNameAndPath));
      System.out.println("Yes " + fileNameAndPath + "exists");
    } catch (FileNotFoundException e){
      System.out.println("No, " + fileNameAndPath + " does not exist");
    }

    long end = System.currentTimeMillis();
    // prints the number of milliseconds that has elasped
    System.out.println(end-start);

    //! Takes 10 seconds
  }
}

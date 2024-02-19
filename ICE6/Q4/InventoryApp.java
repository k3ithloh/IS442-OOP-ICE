import java.io.*;
import java.util.Scanner;

public class InventoryApp {
  public static void main(String[] args) {
    stockTaking("product.csv");
  }

  public static void stockTaking(String fileNameAndPath){
    
    try {
      File file = new File(fileNameAndPath);
      Scanner fileScanner = new Scanner(file);

      while (fileScanner.hasNextLine()){
        String[] productList = fileScanner.nextLine().split(",");
          // System.out.println(Arrays.toString(productList));
        if(productList.length==3){
            System.out.printf("There are %d %s, each cost $%.2f",Integer.parseInt(productList[0]),productList[1],Double.parseDouble(productList[2]));
            System.out.println();
        }
      }
      fileScanner.close();
    }
    catch(FileNotFoundException e){
      System.out.printf("%s is invalid",fileNameAndPath);
      System.out.println();
    }
  }
}

import java.util.*;
import java.io.*;

public class ProductTest {
  public static void main(String[] args){
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));
  
    save(products,"data\\product.csv");
  }

  public static void save(ArrayList<Product> productList, String pathAndFileName){
    //TODO: goes through products and saves each Product as a line in file
    //format: name,quantity,price
    // String[] arrOfPathFileName = pathAndFileName.split("\\\\");
    // System.out.println(arrOfPathFileName[0]);
    // System.out.println(arrOfPathFileName[1]);

    FileWriter newFile = new FileWriter(pathAndFileName);
    
    // File newFile = new File(arrOfPathFileName[0]);
    // try {

    // }
  }
}

import java.util.*;
import java.io.*;

public class ProductTest {
  public static void main(String[] args) {
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));

    save(products, "data\\product.csv");
  }

  public static void save(ArrayList<Product> productList, String pathAndFileName) {
    // TODO: goes through products and saves each Product as a line in file
    // format: name,quantity,price

    File file = new File(pathAndFileName);
    file.getParentFile().mkdirs();
    try {
      PrintStream writer = new PrintStream(new FileOutputStream(file));
      for (Product tempProduct : productList) {
        String tempString = tempProduct.getName() + "," + tempProduct.getQuantity() + "," + tempProduct.getPrice();
        writer.println(tempString);
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

import java.util.*;
import java.io.*;

public class ProductTest {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("apple", 3, 1.2));
        products.add(new Product("orange", 4, 1.1));
        products.add(new Product("pear", 5, 1));

        save(products, "data/product.csv");  //assuming that the directory data is existing
    }

    public static void save(ArrayList<Product> productList, String pathAndFileName) {
        // TODO: goes through products and saves each Product as a line in file
        // format: name,quantity,price

        try (PrintStream out = new PrintStream(new FileOutputStream(pathAndFileName, true));) {
            for (Product product : productList) {
                String name = product.getName();
                int quantity = product.getQuantity();
                double price = product.getPrice();

                out.printf("%s,%d,%.2f%n", name, quantity, price);
            }
        } catch (IOException e) {
            // does nothing according to writeup
            e.printStackTrace(); // for debugging
        }
    }
}

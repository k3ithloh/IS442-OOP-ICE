import java.io.*;
import java.util.*;

public class InventoryApp {
    public static void stockTaking(String filename) {
        try (Scanner sc = new Scanner(new File(filename))) {
            sc.useDelimiter(",|\r\n|\n");
            
            int totalQty = 0;
            double totalPrice = 0;
            while (sc.hasNext()) {
                int quantity = sc.nextInt();
                String name = sc.next();
                double price = sc.nextDouble();

                totalQty += quantity;
                totalPrice += price * quantity;
                System.out.printf("There are %d %s, each cost $%.2f%n", quantity, name, price);
            }            
            System.out.printf("There are %d products with a total value of $%.2f to be sold.%n", totalQty, totalPrice);
            
        } catch (FileNotFoundException e) {
            // this is placed here for debugging purpose
            // for real-life applications, use a logging framework 
            // e.g. log4j or java.util.logging package
            e.printStackTrace();
            // does nothing
        }
    } 
    
    public static void main(String[] args) {
        stockTaking("product.csv");
    }
    
}
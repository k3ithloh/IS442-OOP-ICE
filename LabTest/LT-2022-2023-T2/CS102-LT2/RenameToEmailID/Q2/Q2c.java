/*
 * Name: Keith Loh
 * Email ID: keith.loh.2021
 */

import java.util.*;

public class Q2c {

    public static Perishable[] getExpiringPerishables(List<Product> products, int n) {
        // public static List<Perishable> getExpiringPerishables(List<Product> products,
        // int n) {
        List<Perishable> perishables = new ArrayList<>();

        for (Product product : products) {
            SimpleDate today = new SimpleDate();
            SimpleDate todayPlusNumDays = today.plusDays(n);
            if (product instanceof Perishable) {
                Perishable perishProduct = (Perishable) product;
                SimpleDate expiryDate = perishProduct.getExpiryDate();
                if (expiryDate.isAfter(today)
                        && (expiryDate.isBefore(todayPlusNumDays) || expiryDate.equals(todayPlusNumDays))) {
                    perishables.add(perishProduct);
                }
            }
        }

        Perishable[] perishableArray = perishables.toArray(new Perishable[perishables.size()]);
        return perishableArray;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        { // test case 1
            List<Product> products = List.of(
                    new Product("P1", 140),
                    new Product("P2", 780),
                    new Product("P3", 470),
                    new Product("P4", 250),
                    new Perishable("P5", 760, new SimpleDate(1, 5, 2023)),
                    new Product("P6", 250),
                    new Product("P7", 250),
                    new Perishable("P8", 760, new SimpleDate(1, 1, 2024)));
            Perishable[] result = getExpiringPerishables(products, 30);
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:[(P5, 1/5/2023)]%n");
            System.out.printf("Actual  :%s%n", Arrays.toString(result));
            System.out.println();
        }
        { // test case 2
            List<Product> products = List.of(
                    new Product("P1", 140),
                    new Product("P2", 780),
                    new Product("P3", 470),
                    new Product("P4", 250),
                    new Product("P5", 760),
                    new Product("P6", 250),
                    new Product("P7", 250),
                    new Product("P8", 760));
            Perishable[] result = getExpiringPerishables(products, 30);
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:[]%n");
            System.out.printf("Actual  :%s%n", Arrays.toString(result));
            System.out.println();
        }
        { // test case 3
            List<Product> products = List.of(
                    new Product("P1", 140),
                    new Product("P2", 780),
                    new Product("P3", 470),
                    new Product("P4", 250),
                    new Product("P5", 760),
                    new Product("P6", 250),
                    new Perishable("P7", 760, new SimpleDate(27, 4, 2023)),
                    new Perishable("P8", 760, new SimpleDate(26, 4, 2023)),
                    new Product("P9", 760));
            Perishable[] result = getExpiringPerishables(products, 30);
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:[(P7, 27/4/2023), (P8, 26/4/2023)]%n");
            System.out.printf("Actual  :%s%n", Arrays.toString(result));
            System.out.println();
        }
    }
}

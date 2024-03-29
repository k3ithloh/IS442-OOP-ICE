/*
 * Name: Keith Loh
 * Email ID: keith.loh.2021
 */

import java.util.*;

public class Q2b {
    public static List<Product> getProductsOfCategory(List<Product> products, String category) {
        List<Product> productsOfCategory = new ArrayList<>();
        if ((products == null) || (products.size() == 0)) {
            return productsOfCategory;
        }

        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                productsOfCategory.add(product);
            }
        }
        productsOfCategory.sort(new ProductComparator());
        return productsOfCategory;
    }

    public static void main(String[] args) {

        int tcNum = 1;
        { // test case 1
            List<Product> products = List.of(
                    new Product("P2", 750, "alcohol"),
                    new Product("P3", 250, "fruits"),
                    new Product("P4", 350, "fruits"),
                    new Product("P5", 450, "snacks"),
                    new Product("P6", 550, "fruits"),
                    new Product("P7", 650, "snacks"),
                    new Product("P8", 850, "alcohol"),
                    new Product("P9", 950, "alcohol"),
                    new Product("P1", 150, "fruits"));
            List<Product> answer = getProductsOfCategory(products, "fruits");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.println("Expected:[(P1, 150), (P3, 250), (P4, 350), (P6, 550)]");
            System.out.println("actual  :" + answer);
            System.out.println();
        }
        { // test case 2
            List<Product> products = List.of(
                    new Product("P1", 150, "fruits"),
                    new Product("P2", 750, "alcohol"),
                    new Product("P3", 250, "fruits"),
                    new Product("P4", 350, "fruits"),
                    new Product("P5", 450, "snacks"),
                    new Product("P6", 550, "fruits"),
                    new Product("P7", 650, "snacks"),
                    new Product("P8", 850, "alcohol"),
                    new Product("P9", 950, "alcohol"));
            List<Product> answer = getProductsOfCategory(products, "alcohol");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.println("Expected:[(P2, 750), (P8, 850), (P9, 950)]");
            System.out.println("actual  :" + answer);
            System.out.println();
        }
        { // test case 3
            List<Product> products = List.of(
                    new Product("P1", 150, "fruits"),
                    new Product("P2", 750, "alcohol"),
                    new Product("P3", 250, "fruits"),
                    new Product("P4", 350, "fruits"),
                    new Product("P5", 450, "snacks"),
                    new Product("P6", 550, "fruits"),
                    new Product("P7", 650, "snacks"),
                    new Product("P8", 850, "alcohol"),
                    new Product("P9", 950, "alcohol"));
            List<Product> answer = getProductsOfCategory(products, "vegetables");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.println("Expected:[]");
            System.out.println("actual  :" + answer);
            System.out.println();
        }

    }

}

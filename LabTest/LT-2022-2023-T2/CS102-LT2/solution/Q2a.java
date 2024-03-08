/*
 * Name:
 * Email ID:
 */
import java.util.List;

public class Q2a {

    public static Shop getCheapestShop(List<Product> products, String name) {
        Shop cheapestShop = null;
        Product cheapestProduct = null;
        for (Product p : products) {
            if (p.getName().equals(name)
                    && (cheapestShop == null || p.getPriceInCents() < cheapestProduct.getPriceInCents())) {
                cheapestProduct = p;
                cheapestShop = p.getShop();
            }
        }

        return cheapestShop;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        { // test case 1
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(
                    new Product("P1", 140, s1),
                    new Product("P2", 780, s1),
                    new Product("P3", 470, s1),
                    new Product("P1", 250, s2),
                    new Product("P2", 760, s2),
                    new Product("P3", 850, s2),
                    new Product("P1", 350, s3),
                    new Product("P2", 770, s3),
                    new Product("P3", 450, s3)
            );
            Shop result = getCheapestShop(products, "P3");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:S3%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 2
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(
                    new Product("P1", 140, s1),
                    new Product("P2", 780, s1),
                    new Product("P3", 470, s1),
                    new Product("P1", 250, s2),
                    new Product("P2", 760, s2),
                    new Product("P3", 850, s2),
                    new Product("P1", 350, s3),
                    new Product("P2", 770, s3),
                    new Product("P3", 450, s3)
            );
            Shop result = getCheapestShop(products, "P2");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:S2%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 3
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(
                    new Product("P1", 140, s1),
                    new Product("P2", 780, s1),
                    new Product("P3", 470, s1),
                    new Product("P1", 250, s2),
                    new Product("P2", 760, s2),
                    new Product("P3", 850, s2),
                    new Product("P1", 350, s3),
                    new Product("P2", 770, s3),
                    new Product("P3", 450, s3)
            );
            Shop result = getCheapestShop(products, "P1");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:S1%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 4
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');
            List<Product> products = List.of(
                    new Product("P1", 140, s1),
                    new Product("P2", 780, s1),
                    new Product("P3", 470, s1),
                    new Product("P1", 250, s2),
                    new Product("P2", 760, s2),
                    new Product("P3", 450, s2),
                    new Product("P1", 350, s3),
                    new Product("P2", 770, s3),
                    new Product("P3", 450, s3)
            );
            Shop result = getCheapestShop(products, "P3");
            System.out.printf("Test Case %d: 2 shops with the cheapest price. return the one with smaller index%n", tcNum++);
            System.out.printf("Expected:S2%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 5
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(
                    new Product("P1", 140, s1),
                    new Product("P2", 780, s1),
                    new Product("P3", 470, s1),
                    new Product("P1", 250, s2),
                    new Product("P2", 760, s2),
                    new Product("P3", 850, s2),
                    new Product("P1", 350, s3),
                    new Product("P2", 770, s3),
                    new Product("P3", 450, s3)
            );
            Shop result = getCheapestShop(products, "P4");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:null%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        {
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of();
            Shop result = getCheapestShop(products, "P3");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:null%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
    }

}


//    public List<Perishable> getProductWithHighestPriceDifference(List<Shop> shops) {
//        return null;
//    }
//    public List<Perishable> getMostCommonProduct(List<Shop> shops) {
//        return null;
//    }
//
//    public List<Shop> getOneStopShop(List<Shop> shops, Purchase purchase) {
//        return null;
//    }
// find the list of products with the same price
// get the list of perishable

// shop that sell the cheapest (specific product)
// shop that sell all the products i want
// shop that sells perishable items that has expired
// product with the largest difference in price across shops
// the most common product (sold in most shops)
// shop with the highest percentage of product that are the cheapest
// buy all the products in a store
// P1 - S1
// P2 - S1, S3
// P3 - S2, S3
// P4 -S3, S2
// P5 - S4

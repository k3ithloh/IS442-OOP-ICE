
/*
 * Name: Keith Loh
 * Email ID: keith.loh.2021
 */
import java.util.*;

public class ProductComparator implements Comparator<Product> {

    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }

}
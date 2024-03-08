import java.util.*;

public class Q2e {
    public static Map<String, List<String>> getShopProduct(List<Product> products) {
        Map<String, List<String>> result = new HashMap<>();

        for (Product p : products) {
            result.putIfAbsent(p.getShop().getName(), new ArrayList<>());

            List<String> shopProducts = result.get(p.getShop().getName());
            shopProducts.add(p.getName());
        }
        return result;
    }

    public static Map<String, List<String>> getShopsWithHighestCommonProducts(List<Product> products) {
        Map<String, List<String>>  shopProducts = getShopProduct(products);
        Map<Integer, Set<String>> countMap = new TreeMap<>();
        List<String> shops = new ArrayList<>(shopProducts.keySet());
        for (int i = 0; i < shops.size(); i++) {
            Set<String> shop1 = new TreeSet<>();
            shop1.addAll(shopProducts.get(shops.get(i)));

            for (int j = i + 1; j < shops.size(); j++) {
                Set<String> shop2 = new TreeSet<>();
                shop2.addAll(shopProducts.get(shops.get(j)));
                shop2.retainAll(shop1);

//                System.out.println("shop1" + shop1);
//                System.out.println("shop2" + shop2);
                countMap.putIfAbsent(shop2.size(), new TreeSet<>());

                Set<String> shopWithSameCount = countMap.get(shop2.size());
                shopWithSameCount.add(shops.get(i) + ";" + shops.get(j));
            }
        }
        int largest = new ArrayList<>(countMap.keySet()).get(countMap.size() - 1);

        Set<String> values = countMap.get(largest);
        System.out.println(values);
        Map<String,List<String>> map = new TreeMap<>();
        for (String combinedShops : values) {
            String[] twoShops = combinedShops.split(";");

            String first = twoShops[0];
            String second = twoShops[1];

            addToMap(map, first, second);
            addToMap(map, second, first);
        }
        return map;
    }
    public static void addToMap(Map<String,List<String>> map, String first, String second) {
        List<String> values = map.get(first);
        if (values == null) {
            values = new ArrayList<>();
            map.put(first, values);
        }
        values.add(second);
    }


    public static void main(String[] args) {
        int tcNum = 1;
        { // test case 1
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');
            Shop s4 = new Shop("S4", 'W');
            List<Product> products = List.of(
                    new Product("P2", 10, s1),
                    new Product("P3", 20, s1),
                    new Product("P4", 10, s1),
                    new Product("P5", 20, s1),
                    new Product("P6", 10, s1),
                    new Product("P1", 20, s1),
                    new Product("P1", 30, s2),
                    new Product("P2", 40, s2),
                    new Product("P3", 50, s2),
                    new Product("P5", 40, s3),
                    new Product("P4", 60, s3),
                    new Product("P6", 70, s3),
                    new Product("P1", 80, s4),
                    new Product("P2", 80, s4)
            );
            System.out.printf("Test Case %d%n", tcNum++);
            Map<String,List<String>> result = getShopsWithHighestCommonProducts(products);
            System.out.printf("Expected:{S1=[S2, S3], S2=[S1], S3=[S1]}%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 2
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');
            Shop s4 = new Shop("S4", 'W');
            Shop s5 = new Shop("S5", 'W');
            List<Product> products = List.of(
                    new Product("P1", 10, s1),
                    new Product("P2", 20, s1),
                    new Product("P3", 10, s1),
                    new Product("P4", 20, s1),
                    new Product("P5", 10, s1),
                    new Product("P6", 20, s1),
                    new Product("P1", 30, s2),
                    new Product("P2", 40, s2),
                    new Product("P3", 50, s2),
                    new Product("P5", 40, s3),
                    new Product("P4", 60, s3),
                    new Product("P6", 70, s3),
                    new Product("P2", 80, s4),
                    new Product("P1", 70, s5),
                    new Product("P2", 80, s5)
            );
            System.out.printf("Test Case %d%n", tcNum++);
            Map<String,List<String>> result = getShopsWithHighestCommonProducts(products);
            System.out.printf("Expected:{S1=[S2, S3], S2=[S1], S3=[S1]}%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 3
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');
            Shop s4 = new Shop("S4", 'W');
            Shop s5 = new Shop("S5", 'N');

            List<Product> products = List.of(
                    new Product("P2", 1, s1),
                    new Product("P5", 2, s1),
                    new Product("P4", 1, s1),
                    new Product("P1", 1, s1),
                    new Product("P1", 2, s2),
                    new Product("P2", 2, s2),
                    new Product("P4", 1, s2),
                    new Product("P1", 3, s3),
                    new Product("P2", 3, s3),
                    new Product("P3", 1, s3));
            System.out.printf("Test Case %d%n", tcNum++);
            Map<String,List<String>> result = getShopsWithHighestCommonProducts(products);
            System.out.printf("Expected:{S1=[S2], S2=[S1]}%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 4
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(
                    new Product("P1", 1, s1),
                    new Product("P2", 2, s1),
                    new Product("P4", 1, s1),
                    new Product("P1", 2, s2),
                    new Product("P2", 2, s2),
                    new Product("P4", 1, s2),
                    new Product("P1", 3, s3),
                    new Product("P2", 3, s3),
                    new Product("P3", 1, s3));
            System.out.printf("Test Case %d%n", tcNum++);
            Map<String,List<String>> result = getShopsWithHighestCommonProducts(products);
            System.out.printf("Expected:{S1=[S2], S2=[S1]}%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 5
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');
            Shop s4 = new Shop("S4", 'W');
            List<Product> products = List.of(
                    new Product("P1", 10, s1),
                    new Product("P2", 20, s1),
                    new Product("P1", 30, s2),
                    new Product("P2", 40, s2),
                    new Product("P1", 50, s3),
                    new Product("P2", 60, s3),
                    new Product("P3", 60, s3),
                    new Product("P2", 70, s4),
                    new Product("P3", 80, s4));
            System.out.printf("Test Case %d%n", tcNum++);
            Map<String,List<String>> result = getShopsWithHighestCommonProducts(products);
            System.out.printf("Expected:{S1=[S2, S3], S2=[S1, S3], S3=[S1, S2, S4], S4=[S3]%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }

    }
}
//    public static void main(String[] args) {
//        int tcNum = 1;
//        {
//            Shop s1 = new Shop("S1", 'N');
//            Shop s2 = new Shop("S2", 'S');
//            Shop s3 = new Shop("S3", 'E');
//
//            List<Product> products = List.of(
//                    new Product("P1", 1, s1),
//                    new Product("P2", 2, s1),
//                    new Product("P4", 1, s1),
//                    new Product("P1", 2, s2),
//                    new Product("P2", 2, s2),
//                    new Product("P4", 1, s2),
//                    new Product("P1", 3, s3),
//                    new Product("P2", 3, s3),
//                    new Product("P3", 1, s3));
//            System.out.printf("Test Case %d%n", tcNum++);
//            List<String> result = getShopsWithHighestCommonProducts(products);
//            System.out.printf("Expected:[S1, S2]%n");
//            System.out.printf("Actual  :%s%n", result);
//            System.out.println();
//        }
//        {
//            Shop s1 = new Shop("S1", 'N');
//            Shop s2 = new Shop("S2", 'S');
//            Shop s3 = new Shop("S3", 'E');
//            Shop s4 = new Shop("S4", 'W');
//            List<Product> products = List.of(
//                    new Product("P1", 10, s1),
//                    new Product("P2", 20, s1),
//                    new Product("P1", 30, s2),
//                    new Product("P2", 40, s2),
//                    new Product("P1", 50, s3),
//                    new Product("P2", 60, s3),
//                    new Product("P1", 70, s4),
//                    new Product("P2", 80, s4));
//            System.out.printf("Test Case %d%n", tcNum++);
//            Map<String,String> result = getShopsWithHighestCommonProducts(products);
//            System.out.printf("Expected:[S1, S2, S3, S4]%n");
//            System.out.printf("Actual  :%s%n", result);
//            System.out.println();
//        }
//
//    }

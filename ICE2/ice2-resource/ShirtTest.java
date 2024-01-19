// import Shirt from java.lang.Object;

public class ShirtTest {
    public static void main(String[] args) {
        // ! This flags out as a type error why is that so?
        Shirt shirt1 = new Shirt('R', 85.50, "SMUgger");
        Shirt shirt2 = new Shirt('B', 90.40, "SMUgger");
        Shirt shirt3 = new Shirt('G', 77.60, "(default)");
        
        // * Question 1B
        if (shirt1.isSameBrand(shirt2)){
            System.out.println("s1 same brand as s2:" + true);
        }
        else {
            System.out.println("s1 same brand as s2:" + false);
        }

        // * Question 1C
        if (shirt2.isSameBrand(shirt3)){
            System.out.println("s2 same brand as s3:" + true);   
        }
        else {
            System.out.println("s2 same brand as s3:" + false);
        }

        // * Question 1D
        shirt2.setColour('R');
        
        // System.out.println(String.valueOf(shirt2.getColour()));

        // * Question 1E
        System.out.println(shirt1.toString());
        System.out.println(shirt2.toString());
        System.out.println(shirt3.toString());
    }
}

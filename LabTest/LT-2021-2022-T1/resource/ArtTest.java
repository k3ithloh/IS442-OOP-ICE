
public class ArtTest {

    public static void main(String[] args) {
        {
            ArtTest test = new ArtTest(
                    "apple",
                    "CT",
                    new SimpleDateTime(2021, 11, 4, 13,50));
            System.out.println("Test 1:Positive test");
            System.out.println("Expected:true false apple(Positive, 04/11/2021 13:50)");
            System.out.printf("Actual  :%b %b %s%n", test.isValid(), test.isNegative(), test);
            System.out.println();
        }

        {
            ArtTest test = new ArtTest(
                    "apple",
                    "C",
                    new SimpleDateTime(2021, 11, 4, 13,50));
            System.out.println("Test 2:Negative test");
            System.out.println("Expected:true true");
            System.out.printf("Actual  :%b %b%n", test.isValid(), test.isNegative());
            System.out.println();

        }

        {
            ArtTest test = new ArtTest(
                    "apple",
                    "T",
                    new SimpleDateTime(2021, 11, 4, 13,50));
            System.out.println("Test 3:Invalid Test");
            System.out.println("Expected:false");
            System.out.printf("Actual  :%b%n", test.isValid());
            System.out.println();
            System.out.println("Expected:pass");
            try {
                test.isNegative();
                System.out.println("Actual  :fail");
            } catch(InvalidTestException e) {
                if (e.getMessage().equals("Invalid Test")) {
                    System.out.println("Actual  :pass");
                } else {
                    System.out.println("Actual  :fail");
                }
            }
            System.out.println();

        }

        {
            System.out.println("Test 4:Invalid result passed into constructor");
            System.out.println("Expected:pass");
            try {
                ArtTest test = new ArtTest(
                        "apple",
                        "XXX",
                        new SimpleDateTime(2021, 11, 4, 13,50));
                System.out.println("Actual  :fail");
            } catch(InvalidTestException e) {
                if (e.getMessage().equals("Invalid Test")) {
                    System.out.println("Actual  :pass");
                } else {
                    System.out.println(e.getMessage());
                    System.out.println("Actual  :fail");
                }
            }
            System.out.println();
        }

        {
            ArtTest t1 = new ArtTest(
                    "apple",
                    "CT",
                    new SimpleDateTime(2021, 11, 4, 13,50));

            ArtTest t2 = new ArtTest(
                    "apple",
                    "CT",
                    new SimpleDateTime(2021, 11, 4, 13,50));

            ArtTest t3 = new ArtTest(
                    "orange",
                    "CT",
                    new SimpleDateTime(2021, 11, 4, 13,50));

            System.out.println("Test 1:Equals test");
            System.out.println("Expected:true false");
            System.out.printf("Actual  :%b %b%n", t1.equals(t2), t2.equals(t3));
            System.out.println();
        }

    }
}

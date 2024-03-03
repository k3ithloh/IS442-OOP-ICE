import java.text.SimpleDateFormat;

public class ArtTest {
    private String employeeId;
    private String result;
    private SimpleDateTime date;

    public ArtTest(String employeeId, String result, SimpleDateTime date) {
        if (!result.equals("CT") && !result.equals("C") && !result.equals("T") && !result.equals("")) {
            throw new InvalidTestException("Invalid Test");
        }
        this.result = result;
        this.employeeId = employeeId;
        this.date = date;
    }

    public String toString() {
        String covidResult = "";

        if (result.equals("CT")) {
            covidResult = "Positive";
        } else if (result.equals("C")) {
            covidResult = "Negative";
        } else {
            covidResult = "Invalid";
        }
        return employeeId + " (" + covidResult + ", " + date + ")";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public SimpleDateTime getDate() {
        return date;
    }

    public boolean isValid() {
        if (result.equals("T") || result.equals("")) {
            return false;
        }
        return true;
    }

    public boolean isNegative() {
        if (!isValid()) {
            throw new InvalidTestException("Invalid Test");
        }

        return result.equals("C");
    }

    public boolean equals(ArtTest otherTest) {
        if (this.employeeId.equals(otherTest.employeeId) && this.result.equals(otherTest.result)
                && this.date.equals(otherTest.date)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        {
            ArtTest test = new ArtTest(
                    "apple",
                    "CT",
                    new SimpleDateTime(2021, 11, 4, 13, 50));
            System.out.println("Test 1:Positive test");
            System.out.println("Expected:true false apple(Positive, 04/11/2021 13:50)");
            System.out.printf("Actual  :%b %b %s%n", test.isValid(), test.isNegative(), test);
            System.out.println();
        }

        {
            ArtTest test = new ArtTest(
                    "apple",
                    "C",
                    new SimpleDateTime(2021, 11, 4, 13, 50));
            System.out.println("Test 2:Negative test");
            System.out.println("Expected:true true");
            System.out.printf("Actual  :%b %b%n", test.isValid(), test.isNegative());
            System.out.println();

        }

        {
            ArtTest test = new ArtTest(
                    "apple",
                    "T",
                    new SimpleDateTime(2021, 11, 4, 13, 50));
            System.out.println("Test 3:Invalid Test");
            System.out.println("Expected:false");
            System.out.printf("Actual  :%b%n", test.isValid());
            System.out.println();
            System.out.println("Expected:pass");
            try {
                test.isNegative();
                System.out.println("Actual  :fail");
            } catch (InvalidTestException e) {
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
                        new SimpleDateTime(2021, 11, 4, 13, 50));
                System.out.println("Actual  :fail");
            } catch (InvalidTestException e) {
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
                    new SimpleDateTime(2021, 11, 4, 13, 50));

            ArtTest t2 = new ArtTest(
                    "apple",
                    "CT",
                    new SimpleDateTime(2021, 11, 4, 13, 50));

            ArtTest t3 = new ArtTest(
                    "orange",
                    "CT",
                    new SimpleDateTime(2021, 11, 4, 13, 50));

            System.out.println("Test 1:Equals test");
            System.out.println("Expected:true false");
            System.out.printf("Actual  :%b %b%n", t1.equals(t2), t2.equals(t3));
            System.out.println();
        }

    }
}

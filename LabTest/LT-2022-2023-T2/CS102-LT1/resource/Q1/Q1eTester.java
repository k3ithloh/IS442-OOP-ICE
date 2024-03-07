import java.util.*;

public class Q1eTester extends Q1e {

    private static double score = 0;

    public static void main(String[] args) {
        grade();
        System.out.println("Score    : " + (score / 60) * 3);
    }

    public static void grade() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---------------------- Q1e ----------------------------");
        System.out.println("-------------------------------------------------------");

        int tcNum = 1;

        {
            try {
                String input = "A";
                Double answer = getTermGPA(input);
                Double expected = 4.0;
                System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer)) {
                    score += 10;
                    System.out.println("Result   : Passed");
                } else {
                    System.out.println("Result   : Failed");
                }

                System.out.println("-------------------------------------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        {
            try {
                System.out.println("-------------------------------------------------------");
                String input = "B-";
                Double answer = getTermGPA(input);
                Double expected = 2.7;
                System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer)) {
                    score += 10;
                    System.out.println("Result   : Passed");
                } else {
                    System.out.println("Result   : Failed");
                }

                System.out.println("-------------------------------------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        {
            try {
                System.out.println("-------------------------------------------------------");
                String input = "ABC";
                Double answer = getTermGPA(input);
                Double expected = 3.0;
                System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer)) {
                    score += 10;
                    System.out.println("Result   : Passed");
                } else {
                    System.out.println("Result   : Failed");
                }

                System.out.println("-------------------------------------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        {
            try {
                System.out.println("-------------------------------------------------------");
                String input = "A1DC1";
                Double answer = getTermGPA(input);
                Double expected = 7.0 / 3;
                System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer)) {
                    score += 10;
                    System.out.println("Result   : Passed");
                } else {
                    System.out.println("Result   : Failed");
                }

                System.out.println("-------------------------------------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        {
            try {
                System.out.println("-------------------------------------------------------");
                String input = "A+B2C-3";
                Double answer = getTermGPA(input);
                Double expected = 15.4 / 6;
                System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer)) {
                    score += 10;
                    System.out.println("Result   : Passed");
                } else {
                    System.out.println("Result   : Failed");
                }

                System.out.println("-------------------------------------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        {
            try {
                System.out.println("-------------------------------------------------------");
                String input = "D2A-B1.5C";
                Double answer = getTermGPA(input);
                Double expected = 12.2 / 5.5;
                System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer)) {
                    score += 10;
                    System.out.println("Result   : Passed");
                } else {
                    System.out.println("Result   : Failed");
                }

                System.out.println("-------------------------------------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
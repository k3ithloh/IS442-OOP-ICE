import java.util.*;

public class Q2cTester extends Q2c {

    private static double score = 0;

    public static void main(String[] args) {
        grade();
        System.out.println("Score: " + (score / 30) * 3);
    }

    public static void grade() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---------------------- Q2c ----------------------------");
        System.out.println("-------------------------------------------------------");

        int tcNum = 1;
        {
            try {
                List<School> schools = new ArrayList<>(List.of(
                        new School(1)));
                int expected = Q2cs.expected(tcNum++);
                int actual = getStudentsWithSiblingsInSameSch(schools);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + actual);

                if (expected == actual) {
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
                List<School> schools = new ArrayList<>(List.of(
                        new School(1),
                        new School(2)));
                int expected = Q2cs.expected(tcNum++);
                int actual = getStudentsWithSiblingsInSameSch(schools);
                System.out.println("Expected : " + expected);
                System.out.println("Actual  : " + actual);

                if (expected == actual) {
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
                List<School> schools = new ArrayList<>(List.of(
                        new School(1),
                        new School(3)));
                int expected = Q2cs.expected(tcNum++);
                int actual = getStudentsWithSiblingsInSameSch(schools);
                System.out.println("Expected : " + expected);
                System.out.println("Actual  : " + actual);

                if (expected == actual) {
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
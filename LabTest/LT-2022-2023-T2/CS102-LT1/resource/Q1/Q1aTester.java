import java.util.*;

public class Q1aTester {

    private static double score = 0;

    public static void main(String[] args) {
        grade();
        System.out.println("Score: " + (score / 20) * 2);
    }

    public static void grade() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---------------------- Q1a ----------------------------");
        System.out.println("-------------------------------------------------------");

        int tcNum = 1;

        {
            try {
                ArrayList<String> inputs = new ArrayList<>(List.of("a"));
                ArrayList<Integer> answer = Q1a.getSumOfAsciiValue(inputs);
                ArrayList<Integer> expected = new ArrayList<Integer>(List.of(97));
                System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer)) {
                    score += 15;
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
                ArrayList<String> inputs = new ArrayList<>(List.of("Apple2", "Orange1"));
                ArrayList<Integer> answer = Q1a.getSumOfAsciiValue(inputs);
                ArrayList<Integer> expected = new ArrayList<Integer>(List.of(548, 653));
                System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer)) {
                    if (score == 0){
                        score = 15;
                    } else {
                        score += 2.5;
                    }
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
                ArrayList<String> inputs = new ArrayList<>(List.of("", "a#d!s", "@c)a)b$"));
                ArrayList<Integer> answer = Q1a.getSumOfAsciiValue(inputs);
                ArrayList<Integer> expected = new ArrayList<Integer>(List.of(0, 312, 294));
                System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer)) {
                    if (score == 0){
                        score = 15;
                    } else {
                        score += 2.5;
                    }
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
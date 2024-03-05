import java.util.*;

public class Q1bTester {

    private static double score = 0;

    public static void main(String[] args) {
        grade();
        System.out.println("Score    : " + (score / 20) * 2);
    }

    public static void grade() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---------------------- Q1b ----------------------------");
        System.out.println("-------------------------------------------------------");

        int tcNum = 1;

        {
            try {
                ArrayList<String> inputs = new ArrayList<>(List.of("a"));
                String answer = Q1b.getLongestPalindromeWord(inputs);
                String expected = "a";
                System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (answer != null && expected.equals(answer.toLowerCase())) {
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
                ArrayList<String> inputs = new ArrayList<>(List.of("abba", "xyzyx", "deffed"));
                String answer = Q1b.getLongestPalindromeWord(inputs);
                String expected = "deffed";
                System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (answer != null && expected.equals(answer.toLowerCase())) {
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
                ArrayList<String> inputs = new ArrayList<>(List.of("Madam", "xYzyX", "deFED"));
                String answer = Q1b.getLongestPalindromeWord(inputs);
                String expected = "Madam";
                System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (answer != null && expected.toLowerCase().equals(answer.toLowerCase())) {
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
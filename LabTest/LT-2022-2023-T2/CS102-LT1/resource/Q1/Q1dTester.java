import java.util.*;

public class Q1dTester  {

    private static double score = 0;

    public static void main(String[] args) {
        grade();
        System.out.println("Score    : " + (score / 40) * 3);
    }

    public static void grade() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---------------------- Q1d ----------------------------");
        System.out.println("-------------------------------------------------------");

        int tcNum = 1;

        {
            try {
                ArrayList<String> inputs = new ArrayList<>(
                        List.of("abc"));
                ArrayList<String> answer = Q1d.getIncreasingCharWords(inputs);
                ArrayList<String> expected = new ArrayList<>(List.of("abc"));
                ArrayList<String> expected2 = new ArrayList<>(List.of("ABC"));
                System.out.printf("Test %d: getIncreasingCharWords(%s)%n", tcNum++, inputs);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer) || expected2.equals(answer)) {
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
                ArrayList<String> inputs = new ArrayList<>(
                        List.of("abc", "ABC", "AbC"));
                ArrayList<String> answer = Q1d.getIncreasingCharWords(inputs);
                ArrayList<String> expected = new ArrayList<>(List.of("abc", "ABC", "AbC"));
                ArrayList<String> expected2 = new ArrayList<>(List.of("abc", "abc", "abc"));
                ArrayList<String> expected3 = new ArrayList<>(List.of("ABC", "ABC", "ABC"));
                System.out.printf("Test %d: getIncreasingCharWords(%s)%n", tcNum++, inputs);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer) || expected2.equals(answer) || expected3.equals(answer)) {
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
                ArrayList<String> inputs = new ArrayList<>(
                        List.of("cbA", "DcE", "xAB", "ayb"));
                ArrayList<String> answer = Q1d.getIncreasingCharWords(inputs);
                ArrayList<String> expected = new ArrayList<>();
                System.out.printf("Test %d: getIncreasingCharWords(%s)%n", tcNum++, inputs);
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
                ArrayList<String> inputs = new ArrayList<>(
                        List.of("Test", "Java", "aCe", "Dry", "dory", "Smu", "sCis"));
                ArrayList<String> answer = Q1d.getIncreasingCharWords(inputs);
                ArrayList<String> expected = new ArrayList<>(List.of("aCe", "Dry", "dory"));
                ArrayList<String> expected2 = new ArrayList<>(List.of("ace", "dry", "dory"));
                ArrayList<String> expected3 = new ArrayList<>(List.of("ACE", "DRY", "DORY"));
                System.out.printf("Test %d: getIncreasingCharWords(%s)%n", tcNum++, inputs);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.equals(answer) || expected2.equals(answer) || expected3.equals(answer)) {
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
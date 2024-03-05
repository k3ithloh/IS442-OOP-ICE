import java.util.*;

public class Q1cTester extends Q1c {

    private static double score = 0;

    public static void main(String[] args) {
        grade();
        System.out.println("Score    : " + (score / 50) * 2);
    }

    public static void grade() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---------------------- Q1c ----------------------------");
        System.out.println("-------------------------------------------------------");

        int tcNum = 1;
        {
            try {
                ArrayList<String> inputs = new ArrayList<>(List.of("s", "m", "u"));
                ArrayList<Character> answer = getMostCommonVowel(inputs);
                ArrayList<Character> expected = new ArrayList<>(List.of('u'));
                ArrayList<Character> expected2 = new ArrayList<>(List.of('U'));
                System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
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
                ArrayList<String> inputs = new ArrayList<>(List.of("a", "e"));
                ArrayList<Character> answer = getMostCommonVowel(inputs);
                ArrayList<Character> expected = new ArrayList<>(List.of('a', 'e'));
                ArrayList<Character> expected2 = new ArrayList<>(List.of('A', 'E'));
                System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
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
                ArrayList<String> inputs = new ArrayList<>(List.of("love", "like", "java", "scis", "we"));
                ArrayList<Character> answer = getMostCommonVowel(inputs);
                ArrayList<Character> expected = new ArrayList<>(List.of('e'));
                ArrayList<Character> expected2 = new ArrayList<>(List.of('E'));
                System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
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
                ArrayList<String> inputs = new ArrayList<>(List.of("why", "fry", "dry"));
                ArrayList<Character> answer = getMostCommonVowel(inputs);
                ArrayList<Character> expected = new ArrayList<>();
                System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
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
                ArrayList<String> inputs = new ArrayList<>(List.of("reunion", "idiom", "net", "area", "iodine"));
                ArrayList<Character> answer = getMostCommonVowel(inputs);
                ArrayList<Character> expected = new ArrayList<>(List.of('e'));
                ArrayList<Character> expected2 = new ArrayList<>(List.of('E'));
                System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
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
    }
}
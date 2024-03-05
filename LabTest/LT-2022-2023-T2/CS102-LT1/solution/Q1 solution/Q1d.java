/*
 * Name:
 * Email ID:
 */

import java.util.*;

public class Q1d {
    /*
     * Write the method getIncreasingCharWords
     */
    public static ArrayList<String> getIncreasingCharWords(ArrayList<String> inputs) {
        // insert your code here.
        ArrayList<String> result = new ArrayList<>();
        for (String word : inputs) {
            String copy = word.toLowerCase();
            if (isIncreasingWord(copy)) {
                result.add(word);
            }
        }
        return result;

    }

    public static boolean isIncreasingWord(String word) {
        char prev = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char next = word.charAt(i);
            if (next < prev) {
                return false;
            }
            prev = next;
        }
        return true;
    }
    public static void main(String[] args) {
        int tcNum = 1;
        {
            ArrayList<String> inputs = new ArrayList<>(
                    List.of("access", "AcT", "big", "bUy", "bird"));
            System.out.printf("Test %d:getIncreasingCharWords(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [access, AcT, bUy]");
            System.out.println("Actual   : " + getIncreasingCharWords(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(
                    List.of("a", "dc", "ab"));
            System.out.printf("Test %d:getIncreasingCharWords(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [a, ab]");
            System.out.println("Actual   : " + getIncreasingCharWords(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(
                    List.of("Ailment", "crate", "raid"));
            System.out.printf("Test %d:getIncreasingCharWords(%s)%n", tcNum++, inputs);
            System.out.println("Expected : []");
            System.out.println("Actual   : " + getIncreasingCharWords(inputs));
            System.out.println("-------------------------------------------------------");
        }
    }

}
/*
 * Name:
 * Email ID:
 */

import java.util.*;

public class Q1c {
    /*
     * Write the method getMostCommonVowel
     */
    public static ArrayList<Character> getMostCommonVowel(ArrayList<String> inputs) {
        // insert your code here.
        String vowels = "aeiou";
        int[] vowelCount = {0, 0, 0, 0, 0};

        for (String word : inputs) {
            word = word.toLowerCase();
            for (int i = 0; i < vowels.length(); i++) {
                if (contains(word, vowels.charAt(i))) {
                    vowelCount[i] += 1;
                }
            }
        }
        int mostCommonVowelCount = vowelCount[0];
        ArrayList<Character> result = new ArrayList<>();
        result.add(vowels.charAt(0));

        for (int i = 1; i < vowels.length(); i++) {
            if (vowelCount[i] > mostCommonVowelCount) {
                mostCommonVowelCount = vowelCount[i];
                result.clear();
                result.add(vowels.charAt(i));
            } else if (vowelCount[i] == mostCommonVowelCount) {
                result.add(vowels.charAt(i));
            }
        }

        if (mostCommonVowelCount == 0) {
            return new ArrayList<>();
        }
        return result;
    }

    private static boolean contains(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (current == ch) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    
        int tcNum = 1;
        {
            ArrayList<String> inputs = new ArrayList<>(List.of("Abate", "Facet", "Pen", "idiom"));
            System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [e]");
            System.out.println("Actual   : " + getMostCommonVowel(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(List.of("ace", "ANT", "Pen", "idiom"));
            System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
            System.out.println("Expected : [a, e]");
            System.out.println("Actual   : " + getMostCommonVowel(inputs));
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>(List.of("pygmy", "crypt", "lymph", "psych"));
            System.out.printf("Test %d: getMostCommonVowel(%s)%n", tcNum++, inputs);
            System.out.println("Expected : []");
            System.out.println("Actual   : " + getMostCommonVowel(inputs));
            System.out.println("-------------------------------------------------------");
        }
    }
}
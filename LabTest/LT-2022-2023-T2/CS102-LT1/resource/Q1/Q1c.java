/*
 * Name: Keith Loh
 * Email ID: keith.loh.2021
 */

import java.util.*;

public class Q1c {
    /*
     * Write the method getMostCommonVowel
     */
    public static ArrayList<Character> getMostCommonVowel(ArrayList<String> inputs) {
        // ! ANSWER IS STILL WRONG
        // insert your code here.
        HashMap<Character, Integer> vowelCounts = new HashMap<>();
        for (char vowel : new char[] { 'a', 'e', 'i', 'o', 'u' }) {
            vowelCounts.put(vowel, 0);
        }

        for (String word : inputs) {
            HashSet<Character> uniqueVowels = new HashSet<>();
            for (char ch : word.toLowerCase().toCharArray()) {
                if (vowelCounts.containsKey(ch)) {
                    uniqueVowels.add(ch);
                }
            }
            for (char vowel : uniqueVowels) {
                vowelCounts.put(vowel, vowelCounts.get(vowel) + 1);
            }
        }

        int maxCount = Collections.max(vowelCounts.values());
        ArrayList<Character> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : vowelCounts.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.add(entry.getKey());
            }
        }

        if (result.isEmpty()) {
            return new ArrayList<>(); // Return an empty list if no vowels found
        }

        return result;
        // to make this code compile. Please modify accordingly!
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
/*
 * Name: Keith Loh
 * Email ID: keith.loh.2021
 */

import java.util.*;

public class Q1c {
    /*
     * Write the method getMostCommonVowel
     */

    public static boolean isVowel(char c) {
    return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static ArrayList<Character> getMostCommonVowel(ArrayList<String> inputs) {
        // ! ANSWER IS STILL WRONG
        // insert your code here.
        HashMap<Character, Integer> vowelCounts = new HashMap<>();

        ArrayList<Character> result = new ArrayList<>();

        // for (char vowel : new char[] { 'a', 'e', 'i', 'o', 'u' }) {
        //     vowelCounts.put(vowel, 0);
        // }

        for (String input : inputs){
            String tempString = input.toLowerCase();
            Set<Character> uniqueVowel = new HashSet<Character>();
            for (int i = 0; i < tempString.length(); i ++){
                char character = tempString.charAt(i);
                if (isVowel(character)){
                    if (!uniqueVowel.contains(character)){
                        if (vowelCounts.containsKey(character)){
                        int newValue = vowelCounts.get(character) + 1;
                        vowelCounts.put(character, newValue);
                        }
                    else {
                            vowelCounts.put(character, 1);
                        }
                    }
                }
            }
        }

        // System.out.println(vowelCounts);
        // int maxCount = Collections.max(vowelCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
        // System.out.println("the maxcount is " + maxCount);
        if (!vowelCounts.isEmpty()){
            int maxCount = Collections.max(vowelCounts.entrySet(), Map.Entry.comparingByValue()).getValue();

            for(Map.Entry<Character, Integer> entry : vowelCounts.entrySet()){

                Character key = entry.getKey();
                int value = entry.getValue();
                // System.out.println(value==maxCount);
                
                if(value==maxCount){
                    result.add(key);
                }
            }
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
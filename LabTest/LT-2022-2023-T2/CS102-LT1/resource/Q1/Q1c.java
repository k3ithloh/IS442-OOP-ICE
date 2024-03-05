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

        return null;
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
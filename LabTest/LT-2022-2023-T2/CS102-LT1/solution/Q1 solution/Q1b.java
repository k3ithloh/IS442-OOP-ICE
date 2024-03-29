/*
 * Name:
 * Email ID:
 */

import java.util.*;

public class Q1b {

    /*
     * Write the method getLongestPalindromeWord
     */
    public static String getLongestPalindromeWord(ArrayList<String> inputs) {
        // insert your code here.
        String longest = null;
        for (String s : inputs) {
            if (isPalindrome(s) && (longest == null || s.length() > longest.length())) {
                longest = s;
            }
        }
        return longest; // to make this code compile. Please modify accordingly!
    }

    public static boolean isPalindrome(String word) {
        word = word.toUpperCase();
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int tcNum = 1;
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("Madam");
            inputs.add("wow");
            inputs.add("success");
            inputs.add("kayak");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : Madam");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("apple");
            inputs.add("orange");
            inputs.add("pear");
            inputs.add("kayak");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : kayak");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("abcd");
            inputs.add("cdedc");
            inputs.add("abgba");
            inputs.add("cddc");
            inputs.add("cddca");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : cdedc");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            ArrayList<String> inputs = new ArrayList<>();
            inputs.add("ab");
            inputs.add("abc");
            inputs.add("abccab");
            inputs.add("abab");
            String answer = getLongestPalindromeWord(inputs);
            System.out.printf("Test %d: getLongestPalindromeWord(%s)%n", tcNum++, inputs);
            System.out.println("Expected : null");
            System.out.println("Actual   : " + answer);
            System.out.println("-------------------------------------------------------");
        }
    }
}
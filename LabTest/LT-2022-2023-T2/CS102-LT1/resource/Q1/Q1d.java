/*
 * Name: Keith Loh
 * Email ID: keith.loh.2021
 */

import java.util.*;

public class Q1d {
    /*
     * Write the method getIncreasingCharWords
     */
    public static ArrayList<String> getIncreasingCharWords(ArrayList<String> inputs) {
        // insert your code here.
        ArrayList<String> resultArray = new ArrayList<String>();
        for (String input : inputs) {
            boolean increasingChar = true;
            String tempString = input.toLowerCase();
            int index1 = 0;
            int index2 = 1;

            int stringLength = tempString.length();
            while (index2 < stringLength) {
                if (tempString.charAt(index2) < tempString.charAt(index1)) {
                    increasingChar = false;
                }
                index1++;
                index2++;
            }
            if (increasingChar == true) {
                resultArray.add(input);
            }
        }

        return resultArray;
        // to make this code compile. Please modify accordingly!

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
/*
 * Name: Keith Loh
 * Email ID: keith.loh.2021
 */

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {

        System.out.println("Expected:23");
        System.out.println("Actual  :" + getSmallestPair(2345));

        System.out.println();
        System.out.println("------------");
        System.out.println();
        System.out.println("Expected:2");
        System.out.println("Actual  :" + getSmallestPair(10245));

        System.out.println();
        System.out.println("------------");
        System.out.println();

        System.out.println("Expected:-1");
        System.out.println("Actual  :" + getSmallestPair(1));
        System.out.println();
        System.out.println();

    }

    /*
     * Write the method getSmallestPair such that it takes in an integer say n
     * and returns an integer.
     *
     * The integer returned should be the number that is
     * the SMALLEST of all possible pairs formed from the input n
     * and that which appears consecutively
     *
     * For example if n is 2345, the possible pair of digits are 23, 45, 34
     * Another example: if n is 10245, the possible pair of digits are 10,24,
     * 2(02),45
     */
    public static int getSmallestPair(int number) {
        // insert your code here.
        String numberString = Integer.toString(number);
        int numberLength = numberString.length();
        if (numberLength == 1) {
            return -1;
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numberLength - 1; i++) {
            String tempNumber = "" + numberString.charAt(i) + numberString.charAt(i + 1);
            numbers.add(Integer.parseInt(tempNumber));
        }
        int min = numbers.get(0);
        for (int i : numbers) {
            min = min < i ? min : i;
        }
        return min; // to make this code compile. Please modify accordingly!
    }

}
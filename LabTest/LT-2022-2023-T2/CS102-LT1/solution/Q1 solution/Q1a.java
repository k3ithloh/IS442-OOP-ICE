/*
 * Name:
 * Email ID:
 */

 import java.util.*;

 public class Q1a {
    // you can also use isLetterOrDigit method
    // in the Character class
    public static boolean isLetterOrDigit(char ch) {
        return (ch >= 'a' && ch <= 'z')
            || (ch >= 'A' && ch <= 'Z')
            || (ch >= '0' && ch <= '9');
    }
     /*
      * Write the method getAsciiValue
      */
     public static ArrayList<Integer> getSumOfAsciiValue(ArrayList<String> inputs) {
         // insert your code here
         ArrayList<Integer> result = new ArrayList<>();

         for (String input : inputs) {
             int value = 0;
             for (int i = 0; i < input.length(); i++) {
                 char c = input.charAt(i);
                 if (isLetterOrDigit(c)) {
                     value += c;
                 }
             }
             result.add(value);
         }
 
         return result; // to make this code compile. Please modify accordingly!
     }
 
     public static void main(String[] args) {
         int tcNum = 1;
         {
             System.out.println("-------------------------------------------------------");
             ArrayList<String> inputs = new ArrayList<>();
             inputs.add("a");
             inputs.add("b");
             inputs.add("ab");
             inputs.add("a@b+!!");
             ArrayList<Integer> answer = getSumOfAsciiValue(inputs);
             System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
             System.out.println("Expected : [97, 98, 195, 195]");
             System.out.println("Actual   : " + answer);
             System.out.println("-------------------------------------------------------");
         }
         {
             ArrayList<String> inputs = new ArrayList<>();
             inputs.add("a");
             inputs.add("A");
             inputs.add("1");
             inputs.add("2");
             ArrayList<Integer> answer = getSumOfAsciiValue(inputs);
             System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
             System.out.println("Expected : [97, 65, 49, 50]");
             System.out.println("Actual   : " + answer);
             System.out.println("-------------------------------------------------------");
         }
         {
             ArrayList<String> inputs = new ArrayList<>();
             inputs.add("abc123456");
             inputs.add("AB");
             inputs.add("bcd");
             inputs.add("");
             inputs.add("abc");
             ArrayList<Integer> answer = getSumOfAsciiValue(inputs);
             System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
             System.out.println("Expected : [603, 131, 297, 0, 294]");
             System.out.println("Actual   : " + answer);
             System.out.println("-------------------------------------------------------");
         }
         {
             ArrayList<String> inputs = new ArrayList<>();
             ArrayList<Integer> answer = getSumOfAsciiValue(inputs);
             System.out.printf("Test %d: getAsciiValue(%s)%n", tcNum++, inputs);
             System.out.println("Expected : []");
             System.out.println("Actual   : " + answer);
             System.out.println("-------------------------------------------------------");
         }
     }
 }
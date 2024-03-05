/*
 * Name: Keith Loh
 * Email ID: keith.loh.2021
 */

 import java.util.*;

 public class Q1a {
     /*
      * Write the method getAsciiValue
      */

    public static boolean checkAlphaNumeric(char c){
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            return true;
        }else{
        return false;
        }
    }
     public static ArrayList<Integer> getSumOfAsciiValue(ArrayList<String> inputs) {
         // insert your code here
         ArrayList<Integer> intArray = new ArrayList<Integer>();

         for (String input : inputs){
            int tempValue = 0;
            for (int i = 0; i < input.length(); i++){
                char c = input.charAt(i);
                if (checkAlphaNumeric(c)){
                    tempValue += c;
                }
            }
            intArray.add(tempValue);
         }
         return intArray;
         // to make this code compile. Please modify accordingly!
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
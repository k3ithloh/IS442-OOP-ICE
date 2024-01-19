import java.util.*;

public class Q3 {
  public static void main(String[] args){
    // Ask the user for the input
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter sentence");
    // Save the input into the function sentence
    String sentence = userInput.nextLine();
    // close the scanner
    userInput.close();
    // split the sentence into a array of strings words
    String[] words = sentence.split(" ");
    
    // Initialize an empty string for final result
    String finalResult = "";

    // Loop thru the array of strings in reverse and add it to the string finalResult
    for (int i = words.length-1; i >= 0; i--) {
      finalResult += words[i] + " ";
    }
    System.out.println(finalResult);
  }
}
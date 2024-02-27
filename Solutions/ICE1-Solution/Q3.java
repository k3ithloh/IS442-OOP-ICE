import java.util.*;

public class Q3 {
    public static void solveIt(String sentence) {
        //uses array and split method

        String[] words = sentence.split("\\s");
        for (int i = words.length - 1 ; i >= 0 ; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }

    public static void solveIt2(String sentence) {
        // use the accumulation technique

        String output = "";
        String word = "";
        for (int i = 0 ; i < sentence.length() ; i++) {
            char ch = sentence.charAt(i);
            if (ch == ' ') {
                output = word + " " + output;
                word = "";
            } else {
                word += ch;
            }
        }
        // "vomit" out the last word accumulated
        output = word + " " + output;
        System.out.println(output);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompt for sentence 
        System.out.print("Enter sentence:");
        String sentence = sc.nextLine();
        solveIt(sentence);
        solveIt2(sentence);
    }
}
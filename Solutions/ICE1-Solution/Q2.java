import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompt for the first word
        System.out.print("Enter first word:");
        String word1 = sc.nextLine();

        // prompt for the second word
        System.out.print("Enter second word:");
        String word2 = sc.nextLine();

        // fencepost
        while (word1.charAt(0) != word2.charAt(0)) {
            // print error message
            System.out.println("try again");
            System.out.println();

            // prompt again
            System.out.print("Enter first word:");
            word1 = sc.nextLine();
            
            System.out.print("Enter second word:");
            word2 = sc.nextLine();
        }
        System.out.println("bingo");
    }

}
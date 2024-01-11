import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }
    }

    // This method returns true if str2 can be aligned with str1 
    // and false otherwise. If there is an alignment, this method 
    // also prints out the alignment. See the sample runs of the 
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        // Modify the code below to return the correct value.
        int firstP = 0;
        int secondP = 0;
        String word2 = "";
        while (firstP < str1.length() && secondP < str2.length()){
            if (str1.charAt(firstP) == str2.charAt(secondP)){
                word2 += str2.charAt(secondP);
                firstP++;
                secondP++;
            }
            else{
                word2 += " ";
                firstP++;
            }
        }
        System.out.println(str1);
        System.out.println(word2);
        if (++secondP < str2.length()){
            return false;
        }
        else{
            return true;
        }
    }

}

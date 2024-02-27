import java.util.*;

public class Q8BinaryToText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary message:");
        String binaryString = sc.nextLine();


        String message = "";
        for (int i = 0 ; i <  binaryString.length() ; i += 8) {
            int asciiValue = Integer.parseInt(binaryString.substring(i, i + 8), 2);
            message += (char)asciiValue;
        }
        System.out.println(message);
    }   
}
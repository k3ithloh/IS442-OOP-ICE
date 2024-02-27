import java.util.*;

//the program handles only positive decimals
public class Q8TextToBinary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text message: ");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            // this stores the decimal equivalent of each character
            int chrAsDec = (int) text.charAt(i); 

            // gives the binary of each char that is converted to its int equivalent
            String binary = Integer.toBinaryString(chrAsDec);

            // prints the binary of each char next to each other after padding to length 8
            System.out.print(padSpaces(binary));
        }

    }

    // pads with 0s depending on the actual length of binary sent in
    public static String padSpaces(String bin) {
        int numberOfSpaces = 8 - bin.length(); // we want binary with the length of 8 always
        for (int i = 1; i <= numberOfSpaces; i++) {
            bin = "0" + bin;
        }
        return bin;
    }

    // this could be used if Integer.toBinaryString is not used above
    public static String getBinary(int dec) {
        int rem;
        String remainderString = "";

        do {
            rem = dec % 2; // first iteration: 32 % 2 = 0
            dec = dec / 2; // first iteration: 32 / 2 = 16
            remainderString = remainderString + rem; // holds the binary but in reverse order, first iteration: 0
        } while (dec >= 1);

        String binary = "";
        // to reverse the binary stored in string
        for (int i = remainderString.length() - 1; i >= 0; i--) {
            binary = binary + remainderString.charAt(i);
        }
        return binary;
    }
}
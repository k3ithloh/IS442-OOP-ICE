import java.util.Scanner;

public class Q8BinaryConverter {
    //the program handles only positive decimals
    public static void main( String[] args)   {

        Scanner sc = new Scanner(System.in);

        //altered this program to get decimal input from the user        
        System.out.print("Enter decimal number:");
        int number  = sc.nextInt();
        

        System.out.println("Binary equivalent of " + number + " is " + getBinary(number));  //use 32 to test
    }
  
    public static String getBinary(int dec){
        String remainderString = "";
        String binary = "";
    
        do {
            int rem = dec % 2;  // first iteration: 32 % 2 = 0
            dec = dec / 2; // first iteration: 32 / 2 = 16
            remainderString = remainderString + rem;  //holds the binary but in reverse order, first iteration: 0
        } while(dec >= 1);
        
        //to reverse the binary stored in string 
        for (int i = remainderString.length() - 1; i >= 0; i--){
            binary = binary + remainderString.charAt(i);
        }
        return binary;
    }
  }
  
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size:");
        int size = sc.nextInt();
        for (int i = 0 ; i < size ; i++) {
            // 26 is used with mod operator because there are only 26 letters in the alphabet
            System.out.print((char)('a' + i % 26) + " ");
        }
        System.out.println();
        System.out.println();

        String output = "";
        for (int i = 1 ; i <= size  ; i++) {
            output += "" + i + (i + 1) + (i + 2) + " ";
        }
        System.out.println(output);
        System.out.println();

        String output2 = "";
        for (int i = 1 ; i <= size  ; i++) {
            output2 += i;
            System.out.println(output2);
        }
    }
}
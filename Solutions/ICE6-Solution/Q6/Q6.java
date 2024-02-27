import java.io.*;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename> ");
        String filename = sc.nextLine();

        try (Scanner fileSc = new Scanner(new FileInputStream(filename))) {

            while (fileSc.hasNextLine()) {
                Scanner lineSc = new Scanner(fileSc.nextLine());
                lineSc.useDelimiter(",");

                int sum = 0;
                while (lineSc.hasNext()) {
                    sum += lineSc.nextInt();
                }
                System.out.println(sum);

            }
        } catch (FileNotFoundException e) {
            System.out.println(filename + " is invalid");
        }

    }

}
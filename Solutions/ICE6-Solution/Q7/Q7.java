import java.util.*;
import java.io.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename> ");
        String fileName = sc.nextLine();

        try(Scanner fileSc = new Scanner(new FileInputStream(fileName))) {
            while(fileSc.hasNext()) {
                Scanner lineSc = new Scanner(fileSc.nextLine());
                lineSc.useDelimiter(",");

                List<Integer> numbers = new ArrayList<>();
                while (lineSc.hasNext()) {
                    numbers.add(lineSc.nextInt());    
                }

                String output = "";
                for (int i = numbers.size() - 1; i >= 0; i--) {
                    output += numbers.get(i) + ",";
                }    
                
                if (output.isEmpty()) {
                    System.out.println();
                } else {
                    System.out.println(output.substring(0, output.length() - 1));  //to get rid of the last ,
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println(fileName + " is invalid");
        }


    }
    
    
}
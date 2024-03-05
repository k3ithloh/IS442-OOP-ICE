/*
 *
 * Name: Keith Loh
 */

// ! Do another time come back to it HAVEN'T DO
import java.io.*;
import java.util.*;

public class Utility {
   public static Map<String, List<Person>> readFile(String fileName) throws FileNotFoundException{

    try (Scanner sc = new Scanner(new File(fileName));){

    }
    catch (FileNotFoundException e){
      throw new FileNotFoundException("File no found");
    }
   }

}


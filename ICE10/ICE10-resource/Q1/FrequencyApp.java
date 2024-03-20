import java.util.*;

public class FrequencyApp {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  boolean isPrompt = true;
  Map<String, Integer> wordMap = new HashMap<>();
  while (isPrompt){
    System.out.print("Enter the word> ");

    String tempFruit = sc.nextLine();
    if (tempFruit.equals("")){
      isPrompt = false;
      break;
    }
    else {
      if (wordMap.containsKey(tempFruit)){
        int tempValue = wordMap.get(tempFruit);
        wordMap.replace(tempFruit, tempValue + 1);
      }
      else {
        wordMap.put(tempFruit, 1);
      }
    }
  }
  sc.close();
  System.out.println("Frequency Count:");
  for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
    System.out.println(entry.getValue() + " " + entry.getKey());
  }
 }
}
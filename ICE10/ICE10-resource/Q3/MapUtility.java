import java.util.*;

public class MapUtility {

    public static Map<String,List<String>> reverse(Map<String,String> input) {
        Map<String,List<String>> result = new HashMap<>();
        for (Map.Entry<String,String> temp : input.entrySet()){
            String tempKey = temp.getKey();
            String tempValue = temp.getValue();

            if (result.containsKey(tempValue)){
                List<String> value = result.get(tempValue);
                value.add(tempKey);
                result.replace(tempValue,value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(tempKey);
                result.put(tempValue,value);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Map<String,String> input = new HashMap<>();
        input.put("Alfred", "81");
        input.put("Elise", "61");
        input.put("Billy", "41");
        input.put("Daniel", "41");
        input.put("Charlie", "54");


        System.out.println("Input:  " + input);
        Map<String,List<String>> result = reverse(input);
        System.out.println("Output: " + result);

    }
}

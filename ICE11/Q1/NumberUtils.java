import java.util.*;


public class NumberUtils {
  
  public static Map<Integer, Integer> calculateFrequency(int[] arr) throws IllegalArgumentException{
     Map<Integer,Integer> result = new HashMap<>();
    if (arr == null){
      throw new IllegalArgumentException();
    }
    
    for (int item : arr){
      if (result.containsKey(item)){
        Integer tempValue = result.get(item) + 1;
        result.put(item, tempValue);
      } else{
        result.put(item,1);
      }
    }
    
    return result;
  }

  public static int[] createArray(Map<Integer, Integer> freqMap) throws IllegalArgumentException{
    if (freqMap == null){
      throw new IllegalArgumentException();
    }
    ArrayList<Integer> result = new ArrayList<>();

    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
      // System.out.println(entry.getKey() + "/" + entry.getValue());
      // ! Start at 1 not at 0
      for (int i=1; i <= entry.getValue(); i++ ){
        result.add(entry.getKey());
      }
    }

    Integer[] integerArray = result.toArray(new Integer[0]);
    int[] intArray = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
    
    return intArray;
  }

  public static int max(int[] arr) throws IllegalArgumentException{
    if (arr == (null)){
      throw new IllegalArgumentException();
    }
    else if (arr.length == 0){
      throw new IllegalArgumentException();
    }
    int maxValue = arr[0];
    for (int i = 1; i < arr.length; i++){
      if (arr[i] > maxValue){
        maxValue = arr[i];
      }
    }
    return maxValue;
  }

  public static int max(int x, int y, int z){
    return Math.max(x, Math.max(y, z));
  }

  public static List<Pair> findPairs(int[] arr, int value) throws IllegalArgumentException{
    System.out.print(value);
    if (arr == null ){
      return new ArrayList<>();
    } else if (arr.length == 0) {
      return new ArrayList<>();
    }
    List<Pair> result = new ArrayList<>();
    for (int i = 0; i < arr.length; i++ ){
      for (int j=i+1; j < arr.length; j++){
        if (arr[i]+ arr[j] == value){
          Pair tempPair = new Pair(arr[i],arr[j]);
          result.add(tempPair);
        }
      }
    }
    return result;
  }

  public static int findTheMissingNumber(int[] arr, int n){

    for (int i = 1; i <= n; i++ ){
      
      Arrays.sort(arr);
      int res = Arrays.binarySearch(arr, i);
      System.out.print(res);
      boolean test = res >= 0 ? true : false;
      if (test==false){
        return i;
      }
    }
    return 0;
  }
}

public class ArrayUtility {
  
  // public static String printArray(int[] array){
  //   if (array == null){
  //     return "[]";
  //   }

  //   int arrayLength = array.length;
  //   if (arrayLength == 0){
  //     return "[]";
  //   }

  //   String result = "[";
    
  //   for (int i = 0; i < arrayLength; i++){
  //     result += array[i] + ", ";
  //   }
  //   result += array[arrayLength-1] + "]";
  //   return result;
  // }
  public static String printArray(int[] array) {
    if (array == null || array.length == 0) {
        return "[]";
    }
    StringBuilder result = new StringBuilder("[");
    for (int i = 0; i < array.length - 1; i++) {
        result.append(array[i]).append(", ");
    }
    result.append(array[array.length - 1]).append("]");
    return result.toString();
  }

  public static int sum(int[] numArray){
     int sumOfArray = 0;
    if (numArray==null){
      return sumOfArray;
    }
    if (numArray.length == 0){
      return sumOfArray;
    }
    for (int number : numArray){
      sumOfArray += number;
    } 
    return sumOfArray;
  }

  public static int[] twoTimes(int[] original){
    if (original == null){
      return new int[0];
    }
    int originalLength = original.length;
    if (originalLength == 0){
      return new int[0];
    }

    int[] result = new int[originalLength];
    for (int i = 0; i < originalLength; i++){
      int tempNumber = original[i] * 2;
      result[i] = tempNumber;
    }
    return result;
  }

  public static void reverse(int[] array){
    
    int arrayLength = array.length;
    int[] tempArray = new int[arrayLength];
    int tempIndex = 0;
    for (int i = arrayLength-1; i >= 0; i--){
      tempArray[tempIndex] = array[i];
      tempIndex ++;
    }

    for (int i = 0; i < arrayLength; i++){
      array[i] = tempArray[i];
    }
  }
}

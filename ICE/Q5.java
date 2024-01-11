import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size: ");
    int size = sc.nextInt();
    alphabetSize(size);
    numberPattern(size);
    stairPattern(size);
    sc.close();
  }

  public static void alphabetSize(int size) {
    for (int i = 0; i < size; i++) {
        char ch = (char) ('a' + i % 26);
        System.out.print(ch + " ");
    }
    System.out.println();
  }

  public static void numberPattern(int size){
    String result = "";
    int init = 1;
    for (int i = 0; i < size; i++ ){
      int tempNum = init;
      // ? Check what is the edge case for question 5
      String temp = String.valueOf(tempNum) + String.valueOf(++tempNum) + String.valueOf(++tempNum);
      init++;
      // String temp = tempNum + "" + ++tempNum + "" + ++tempNum + "";
      result += temp + " ";
    }
    System.out.println(result);
  }

  public static void stairPattern(int size){
  String str = "";
  for (int i = 1; i <= size; i++){
    str += i;
    System.out.println(str);
  }
}

  // ! Method using StringBuilder Method
  // public static void stairPattern(int size){
  //   StringBuilder sb = new StringBuilder();
  //   for (int i = 1; i <= size; i++){
  //     sb.append(i);
  //     System.out.println(sb.toString());
  //   }
  // }
  // ! Method using double for loop *incorrect*
  // public static void stairPattern(int size){
  //   for (int i = 1; i <= size; i ++ ){
  //     String temp = "";
  //     for (int j = 1; j <= i; j++){
  //       temp += Integer.toString(j);
  //     }
  //     System.out.println(temp);
  //   }
  // }
}
import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size: ");
    int size = sc.nextInt();
    alphabetSize(size);
    numberPattern(size);
    int sizeCopyC = size;
    pyramid(sizeCopyC, 1);
    sc.close();
  }

  public static void alphabetSize(int size) {
    for (int i = 0; i < size; i++) {
      char ch = (char) ('a' + i % 26);
      System.out.print(ch + " ");
    }
    System.out.println();
  }

  public static void numberPattern(int size) {
    String result = "";
    int init = 1;
    boolean up = true;
    for (int i = 0; i < size; i++) {
      int tempNum = init;
      String temp = "";
      // * Handling when init below 7
      if (up) {
        temp = String.valueOf(tempNum) + String.valueOf(++tempNum) + String.valueOf(++tempNum);
        init++;
      } else {
        // * Handle when init above 7
        temp = String.valueOf(tempNum) + String.valueOf(--tempNum) + String.valueOf(--tempNum);
        init--;
      }
      if (init > 7) {
        up = false;
      } else if (init == 1) {
        up = true;
      }
      // String temp = tempNum + "" + ++tempNum + "" + ++tempNum + "";
      result += temp + " ";
    }
    System.out.println(result);
  }

  public static void pyramid(int n, int i) {
    if (n == 0)
      return;

    int j;
    for (j = 1; j < i; j++) {
      System.out.print(j + " ");
    }
    System.out.println(j);

    pyramid(n - 1, i + 1);
  }
}
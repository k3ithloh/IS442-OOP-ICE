/*
 * Name:
 * Email ID:
 */
import java.util.Arrays;

public class Q1b {
    public static double percent(long[] numbers, boolean isOdd) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int numEven = 0;
        for (long num : numbers) {
            if (num % 2 == 0) {
                numEven++;
            }
        }
        double percentEven = 100.0 * numEven/numbers.length;

        if (isOdd) {
            return 100 - percentEven;
        }
        return percentEven;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            long[] inputs =  {6, 2};
            boolean isOdd = true;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:0.0");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
        {
            long[] inputs =  {6, 2, 9, 11, 3};
            boolean isOdd = false;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:40.0");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
        {
            long[] inputs =  {6, 2, 9, 11, 3, 4};
            boolean isOdd = false;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:50.0");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
        {
            long[] inputs =  {6, 2, 9, 11, 3, 33};
            boolean isOdd = false;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:33.3");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
        {
            long[] inputs =  {};
            boolean isOdd = false;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:0.0");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
        {
            long[] inputs =  null;
            boolean isOdd = false;
            System.out.printf("Test %d: percent(%s, %b)%n", tcNum++, Arrays.toString(inputs),  isOdd);
            double result = percent(inputs, isOdd);
            System.out.println("Expected:0.0");
            System.out.printf("Actual  :%.1f%n", result);
            System.out.println();
        }
    }
}

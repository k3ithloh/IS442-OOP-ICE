
/**
 * Name : Keith Loh
 * Email: keith.loh.2021@scis.smu.edu.sg
 */
import java.util.*;

public class Q1 {

    public static long[] contains(long[] nums, long target) {
        if (nums == null) {
            return new long[0];
        }

        String targetString = Long.toString(target);
        List<Long> matchNums = new ArrayList<Long>();

        for (long num : nums) {
            String tempNum = Long.toString(num);
            if (tempNum.contains(targetString)) {
                matchNums.add(num);
            }
        }

        long[] matchArray = new long[matchNums.size()];

        for (int i = 0; i < matchNums.size(); i++) {
            matchArray[i] = matchNums.get(i);
        }
        return matchArray;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            long[] nums = { 23, 123, 231, 4123, 321, 23, 132, 2134 };
            long target = 23;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[23, 123, 231, 4123, 23]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
        {
            long[] nums = { 1234, 231, 33, 45, 3216, 123456, 10001230 };
            long target = 3;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[1234, 231, 33, 3216, 123456, 10001230]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
        {
            long[] nums = { 1234, 231, 33, 45, 3216, 123456, 10001230 };
            long target = 9;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
        {
            long[] nums = {};
            long target = 0;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
        {
            long[] nums = null;
            long target = 0;
            System.out.printf("Test %d:endsWith(%s, %d)%n", tcNum++, Arrays.toString(nums), target);
            System.out.printf("Expected:[]%n");
            long[] result = contains(nums, target);
            System.out.printf("Actual  :%s%n%n", Arrays.toString(result));
        }
    }

}

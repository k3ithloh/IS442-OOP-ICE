public class Q1 {

    public static int sumOfDigits(int number) {
        if (number < 0) {
            number = -number;
        }
        String value = "" + number;

        int sum = 0;
        for (int i = 0 ; i < value.length() ; i++) {
            sum += value.charAt(i) - '0';  //gets the difference between the digit at position i and '0' 
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Test 1");
        int result = sumOfDigits(123);
        System.out.println("Expected:6");
        System.out.println("Actual  :" + result);
        System.out.println();

        System.out.println("Test 2");
        result = sumOfDigits(-354);
        System.out.println("Expected:12");
        System.out.println("Actual  :" + result);
        System.out.println();
    }
}

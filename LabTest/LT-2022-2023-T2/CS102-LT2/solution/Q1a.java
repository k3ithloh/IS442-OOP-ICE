public class Q1a {
    public static String stutter(String s, int n) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += ("" + s.charAt(i)).repeat(n);
            // alternatively
//            char ch = s.charAt(i);
//            for (int j = 0; j < n; j++) {
//                result += ch;
//            }
        }
        return result;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            String str = "he";
            int n = 0;
            System.out.printf("Test %d: stutter(%s, %d)%n", tcNum++, str,  n);
            String result = stutter(str, n);
            System.out.println("Expected:[]");
            System.out.printf("Actual  :[%s]%n", result);
            System.out.println();
        }
        {
            String str = "Hello";
            int n = 1;
            System.out.printf("Test %d: stutter(%s, %d)%n", tcNum++, str,  n);
            String result = stutter(str, n);
            System.out.println("Expected:Hello");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        {
            String str = "world";
            int n = 3;
            System.out.printf("Test %d: stutter(%s, %d)%n", tcNum++, str,  n);
            String result = stutter(str, n);
            System.out.println("Expected:wwwooorrrlllddd");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
    }
}

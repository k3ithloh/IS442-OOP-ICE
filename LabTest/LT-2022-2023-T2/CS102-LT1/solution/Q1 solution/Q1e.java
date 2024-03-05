import java.util.*;

public class Q1e {
    /*
     * Write the method getTermGPA
     */
    public static double getTermGPA(String input) {
        // insert your code here.
        List<Double> pointUnits = getRawValues(input);
        double sum = 0;
        
        double numUnits = 0; //added

        for (int i = 0; i < pointUnits.size(); i += 2) {
            sum += pointUnits.get(i) * pointUnits.get(i + 1);
            numUnits += pointUnits.get(i); //added
        }
        return sum / numUnits;
    }

    private static double getGradePoint(String letter) {
        return switch (letter) {
            case "A+"   ->  4.3;
            case "A"    ->  4;
            case "A-"   ->  3.7;
            case "B+"   ->  3.3;
            case "B"    ->  3.0;
            case "B-"   ->  2.7;
            case "C+"   ->  2.3;
            case "C"   ->   2;
            case "C-"   ->  1.7;
            case "D+"   ->  1.3;
            case "D"   ->   1.0;
            default   ->   0;
        };
    }

    public static boolean isDigitOrDot(char ch) {
        return (ch >= '0' && ch <= '9') || ch == '.';
    }
    
    private static List<Double> getRawValues(String termGrades) {
        int len = termGrades.length();
        termGrades = termGrades + ' ';
    
        List<Double> result = new ArrayList<>();
        int idx = 0;
        while (idx < len) {
            String gradeLetter = "" + termGrades.charAt(idx++);
            char lookAhead = termGrades.charAt(idx);
            if (lookAhead == '+' || lookAhead == '-') {
                gradeLetter += lookAhead;
                idx++;
            } 
            lookAhead = termGrades.charAt(idx);
            if (isDigitOrDot(lookAhead)) {
                String number = "";
                while (isDigitOrDot(lookAhead)) {
                    number +=  lookAhead;
                    lookAhead = termGrades.charAt(++idx);
                }
                // System.out.println("=" + number);
                result.add(Double.parseDouble(number));
            } else {
                result.add(1.0);
            }
            result.add(getGradePoint(gradeLetter));
        }
        return result;
    }
    public static void main(String[] args) {
        int tcNum = 1;
        {
            System.out.println("-------------------------------------------------------");
            String input = "A1B1C1";
            double answer = getTermGPA(input);
            System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
            System.out.println("Expected :3.0");
            System.out.println("Actual   :" + answer);
            System.out.println("-------------------------------------------------------");
        }
        {
            String input = "AB0.5C";
            double answer = getTermGPA(input);
            System.out.printf("Test %d: getTermGPA(\"%s\")%n", tcNum++, input);
            System.out.println("Expected :3.0");
            System.out.println("Actual   :" + answer);
            System.out.println("-------------------------------------------------------");
        }
    }
}
import java.util.*;

public class Q1e {
    /*
     * Write the method getTermGPA
     */

    
    public static boolean isDigitOrDot(char ch) {
        return (ch >= '0' && ch <= '9') || ch == '.';
    }

    public static double getGradePoint(String input){
        HashMap<String, Double> gradeMap = new HashMap<String, Double>();
        gradeMap.put("A+", 4.3);
        gradeMap.put("A",4.0);
        gradeMap.put("A-",3.7);
        gradeMap.put("B+",3.3);
        gradeMap.put("B",3.0);
        gradeMap.put("B-",2.7);
        gradeMap.put("C+",2.3);
        gradeMap.put("C",2.0);
        gradeMap.put("C-",1.7);
        gradeMap.put("D+",1.3);
        gradeMap.put("D",1.0);
        gradeMap.put("F",0.0);
        // return gradeMap.get(input);
        Double gradePoint = gradeMap.get(input);
        if (gradePoint != null) {
            return gradePoint;
        } else {
            return 0.0; // Default value
        }
    }
    
    public static double getTermGPA(String input) {
    List<Double> pointUnits = getRawValues(input);
    double sum = 0;
    double numUnits = 0;

    for (int i = 0; i < pointUnits.size(); i += 2) {
        sum += pointUnits.get(i) * pointUnits.get(i + 1);
        numUnits += pointUnits.get(i);
    }

    if (numUnits == 0) {
        return 0.0; // Avoid division by zero
    }

    return sum / numUnits;
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
            result.add(Double.parseDouble(number));
        } else {
            result.add(1.0);
        }
        result.add(getGradePoint(gradeLetter));
    }
    return result;
}

    // public static double getTermGPA(String input) {
    //     // insert your code here.
    //     // ArrayList<Double> totalGrades = new ArrayList<>();
    //     double totalGrades = 0.0;
    //     double totalUnits = 0.0;

    //     int inputLength = input.length() - 1 ;
    //     int i = 0;
        
    //     while (i < inputLength){
    //         char tempChar = input.charAt(i);
    //         char lookAhead = input.charAt(i + 1);
    //         String grade = String.valueOf(tempChar);
    //         if (lookAhead == '+' || lookAhead == '-'){
    //             grade += lookAhead;
    //             i ++;
    //         }
    //         i ++;

    //         double tempUnits = 1.0;
    //         if (i < inputLength && isDigitOrDot(input.charAt(i))) {
    //         StringBuilder unitsBuilder = new StringBuilder();
    //             while (i < inputLength && isDigitOrDot(input.charAt(i))) {
    //                 unitsBuilder.append(input.charAt(i));
    //                 i++;
    //             }
    //             tempUnits = Double.parseDouble(unitsBuilder.toString());
    //         } else {
    //             tempUnits = 1.0;
    //         }
    //         totalGrades += getGradePoint(grade) * tempUnits;
    //         totalUnits += tempUnits;
    // }
    //     if (totalUnits == 0.0) {
    //         return 0.0;
    //     }
    
    // return totalGrades / totalUnits;
    // }
    
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
            String input = "ABC";
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
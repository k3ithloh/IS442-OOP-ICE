/*
 * Name:
 * Email ID:  
 */

import java.util.*;

public class Q2c {
    // ****************************************************
    // Follow the instructions below to test your methods.
    public static void main(String[] args) {
        List<School> schools = new ArrayList<>(List.of(
            new School(1),
            new School(2),
            new School(3)));

        /*
         * *******************************************************************
         * The following code tests the method getStudentsWithSiblingsInSameSch.
         */
        System.out.println("Expected:5");
        System.out.println("Actual  :" + getStudentsWithSiblingsInSameSch(schools));
    
    }

    /*
     * Write the method getStudentsWithSiblingsInSameSch
     */
    private static int getStudentsWithSiblingsInSameSch(List<School> schools) {
        List<Student> result = new ArrayList<>();

        for (School school : schools) {
            List<Student> students = school.getStudents();
            List<Student> temp = new ArrayList<>();
            for (int i = 0; i < students.size() - 1; i++) {
                for (int j = i + 1; j < students.size(); j++) {
                    if (students.get(i).getParent().equals(students.get(j).getParent())) {
                        if (!temp.contains(students.get(i))) {
                            temp.add(students.get(i));
                        }
                        if (!temp.contains(students.get(j))) {
                            temp.add(students.get(j));
                        }
                    }
                }
            }
            result.addAll(temp);
        }
        // System.out.println(result);
        return result.size();
    }
}

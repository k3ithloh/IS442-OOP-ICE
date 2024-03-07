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
    public static int getStudentsWithSiblingsInSameSch(List<School> schools) {
        // insert your code here.
        int StudentsWithSiblingsInSameSch = 0;
        for (School school : schools) {
            List<Student> students = school.getStudents();
            ArrayList<Student> temp = new ArrayList<>();
            for (int i = 0; i < students.size(); i++) {
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
            StudentsWithSiblingsInSameSch += temp.size();
        }
        return StudentsWithSiblingsInSameSch;
        // to make this code compile. Please modify accordingly!
    }
}

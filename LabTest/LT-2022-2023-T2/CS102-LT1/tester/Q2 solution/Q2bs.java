import java.util.*;

public class Q2bs {

    public static List<Student> expected(int testCaseNum) {

        ArrayList<Student> result = new ArrayList<>();
        List<School> schools;

        switch (testCaseNum) {
            case 1:
                schools = new ArrayList<>(List.of(
                        new School(1)));
                return getStudents(schools, 2024, "P2");
            case 2:
                schools = new ArrayList<>(List.of(
                        new School(1),
                        new School(2),
                        new School(3)));
                return getStudents(schools, 2022, "P3");
            case 3:
                schools = new ArrayList<>(List.of(
                        new School(1),
                        new School(2),
                        new School(3)));
                return getStudents(schools, 2022, null);
        }
        return result;
    }

    private static ArrayList<Student> getStudents(List<School> schools, int yearJoined,
            String level) {

        ArrayList<Student> result = new ArrayList<>();
        for (School school : schools) {
            List<Student> students = school.getStudents();
            for (Student student : students) {
                String dateJoined = student.getDateJoined();
                int year = Integer.parseInt(dateJoined.substring(dateJoined.length() - 4));
                if (level == null) {
                    if (year == yearJoined) {
                        result.add(student);
                    }
                } else {
                    if (student.getLevel().equals(level) && year == yearJoined) {
                        result.add(student);
                    }
                }
            }
        }
        return result;
    }

}

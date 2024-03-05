import java.util.*;

public class Q2cs {

    public static int expected(int testCaseNum) {
        List<School> schools = new ArrayList<>();

        switch (testCaseNum) {
            case 1:
            schools = new ArrayList<>(List.of(
                new School(1)));
                break;
            case 2:
            schools = new ArrayList<>(List.of(
                new School(1),
                new School(2)));
                break;
            case 3:
            schools = new ArrayList<>(List.of(
                new School(1),
                new School(3)));
                break;
        }

        return getStudentsWithSiblingsInSameSch(schools);
    }

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

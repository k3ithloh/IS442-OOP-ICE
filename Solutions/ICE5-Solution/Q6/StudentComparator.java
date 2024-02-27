import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int name_diff = o1.getName().compareTo(o2.getName());
        if (name_diff == 0) {
            return o1.getAge() - o2.getAge();
        }
        return name_diff;
    }
}
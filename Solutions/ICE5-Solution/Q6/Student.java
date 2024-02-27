import java.lang.Comparable;

public class Student implements Comparable<Student>{
    private int age;
    private String name;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    public String toString() {
        return String.format("%s : %s", name, age);
    }
}
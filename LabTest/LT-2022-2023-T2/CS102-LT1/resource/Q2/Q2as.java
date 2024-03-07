import java.util.*;

public class Q2as {

    public static ArrayList<School> expected(int testCaseNum) {
        ArrayList<School> schools = new ArrayList<>();

        switch (testCaseNum) {
            case 1:
                schools.add(new School("ABC School", 1));
                enrol("John", "P1", "1/1/2022", "Jason", schools);
                break;
            case 2:
                schools.add(new School("ABC School", 1));
                schools.add(new School("DEF School", 2));
                schools.add(new School("GHI School", 3));
                schools.add(new School("XYZ School"));

                enrol("John", "P1", "1/1/2022", "Jason", schools);
                enrol("Mary", "P2", "1/1/2023", "Betty", schools);
                enrol("Kelly", "P2", "1/1/2024", "Jason", schools);
                enrol("Lionel", "P2", "1/1/2023", "David", schools);
                enrol("Sandy", "P1", "1/1/2023", "Betty", schools);
                enrol("Adrian", "P3", "1/1/2022", "Tony", schools);
                enrol("Zoe", "P2", "1/1/2024", "Jason", schools);
                enrol("Charlie", "P2", "1/1/2023", "Tony", schools);
                enrol("Francis", "P3", "1/1/2022", "Tony", schools);
                break;
            case 3:
                schools.add(new School("ABC School", 1));
                schools.add(new School("DEF School", 2));
                schools.add(new School("GHI School", 3));
                schools.add(new School("XYZ School", 4));

                enrol("John", "P1", "1/1/2022", "Jason", schools);
                enrol("Mary", "P2", "1/1/2023", "Betty", schools);
                enrol("Kelly", "P2", "1/1/2024", "Jason", schools);
                break;
        }
        return schools;
    }

    private static void enrol(String name, String level, String dateJoined, String parent,
            ArrayList<School> schools) {
        for (School school : schools) {
            if (school.enrol(new Student(name, level, dateJoined, new Person(parent)))) {
                break;
            }
        }
    }
}

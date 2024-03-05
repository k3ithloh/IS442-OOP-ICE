import java.util.*;

public class Q2aTester extends Q2a {

    private static double score = 0;

    public static void main(String[] args) {
        grade();
        System.out.println("Score: " + (score / 20) * 2);
    }

    public static void grade() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---------------------- Q2a ----------------------------");
        System.out.println("-------------------------------------------------------");

        int tcNum = 1;
        {
            try {
                ArrayList<School> schools = new ArrayList<>();
                schools.add(new School("ABC School", 1));
                enrol("John", "P1", "1/1/2022", "Jason", schools);

                ArrayList<School> expected = Q2as.expected(tcNum++);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + schools);

                double marks = 0;
                for (int i = 0; i < expected.size(); i++) {
                    if (expected.get(i).getStudents().size() == schools.get(i).getStudents().size()) {
                        marks += 1;
                    }
                }
                if (marks == expected.size()) {
                    score += 15;
                    System.out.println("Result   : Passed");
                } else {
                    System.out.println("Result   : Failed");
                }
                System.out.println("-------------------------------------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        {
            try {
                ArrayList<School> schools = new ArrayList<>();
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

                ArrayList<School> expected = Q2as.expected(tcNum++);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + schools);

                double marks = 0;
                for (int i = 0; i < expected.size(); i++) {
                    if (expected.get(i).getStudents().size() == schools.get(i).getStudents().size()) {
                        marks += 1;
                    }
                }
                if (marks == expected.size()) {
                    if (score == 0){
                        score = 15;
                    } else {
                        score += 2.5;
                    }
                    System.out.println("Result   : Passed");
                } else {
                    System.out.println("Result   : Failed");
                }
                System.out.println("-------------------------------------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        {
            try {
                ArrayList<School> schools = new ArrayList<>();
                schools.add(new School("ABC School", 1));
                schools.add(new School("DEF School", 2));
                schools.add(new School("GHI School", 3));
                schools.add(new School("XYZ School", 4));

                enrol("John", "P1", "1/1/2022", "Jason", schools);
                enrol("Mary", "P2", "1/1/2023", "Betty", schools);
                enrol("Kelly", "P2", "1/1/2024", "Jason", schools);

                ArrayList<School> expected = Q2as.expected(tcNum++);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + schools);

                double marks = 0;
                for (int i = 0; i < expected.size(); i++) {
                    if (expected.get(i).getStudents().size() == schools.get(i).getStudents().size()) {
                        marks += 1;
                    }
                }
                if (marks == expected.size()) {
                    if (score == 0){
                        score = 15;
                    } else {
                        score += 2.5;
                    }
                    System.out.println("Result   : Passed");
                } else {
                    System.out.println("Result   : Failed");
                }
                System.out.println("-------------------------------------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
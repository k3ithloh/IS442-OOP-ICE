import java.util.*;

public class Q2bTester extends Q2b {

    private static double score = 0;

    public static void main(String[] args) {
        grade();
        System.out.println("Score: " + (score / 20) * 3);

    }

    public static void grade() {
        System.out.println("-------------------------------------------------------");
        System.out.println("---------------------- Q2b ----------------------------");
        System.out.println("-------------------------------------------------------");

        int tcNum = 1;
        {
            try {
                List<School> schools = new ArrayList<>(List.of(
                    new School(1)));

                List<Student> answer = getStudents(schools, 2024, "P2");
                List<Student> expected = Q2bs.expected(tcNum++);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.size() == answer.size()) {
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
                List<School> schools = new ArrayList<>(List.of(
                    new School(1),
                    new School(2),
                    new School(3)));
                List<Student> answer = getStudents(schools, 2022, "P3");
                List<Student> expected = Q2bs.expected(tcNum++);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.size() == answer.size()) {
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
                List<School> schools = new ArrayList<>(List.of(
                    new School(1),
                    new School(2),
                    new School(3)));
                List<Student> answer = getStudents(schools, 2022, null);
                List<Student> expected = Q2bs.expected(tcNum++);
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + answer);

                if (expected.size() == answer.size()) {
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
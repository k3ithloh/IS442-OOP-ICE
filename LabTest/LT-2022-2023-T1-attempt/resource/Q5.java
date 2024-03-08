/**
 * Name : Keith Loh
 * Email: keith.loh.2021
 */
import java.util.*;
import labtest.Meeting;
import labtest.Employee;


public class Q5 {

    public static Map<String, Set<String>> getTopMeetingCompanions(List<Meeting> meetings) {
        Map<String, Set<String>> result = new TreeMap<>();

        Map<String, Integer> employeeMatching = new TreeMap<>();
        for (Meeting meeting : meetings){
            
        }

        return null;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            Map<String, Set<String>> result = getTopMeetingCompanions(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("B"),
                                    new Employee("C")
                            }
                    ),
                    new Meeting(
                            "M2",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("A"),
                                    new Employee("D")
                            }
                    ),
                    new Meeting(
                            "M3",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{new Employee("B"), new Employee("C")}
                    ),
                    new Meeting(
                            "M4",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("A"),
                                    new Employee("B"),
                                    new Employee("C"),
                                    new Employee("D")
                            }
                    )));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:{B=[C], C=[B]}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
        {
            Map<String, Set<String>> result = getTopMeetingCompanions(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("C"),
                                    new Employee("D")
                            }
                    ),
                    new Meeting(
                            "M2",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("A"),
                                    new Employee("B")
                            }
                    ),
                    new Meeting(
                            "M3",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("B"),
                                    new Employee("D")
                            }
                    ),
                    new Meeting(
                            "M4",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[]{
                                    new Employee("C"),
                                    new Employee("A"),
                                    new Employee("B"),
                                    new Employee("D")
                            }
                    )
            ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:{A=[B], B=[A, D], C=[D], D=[B, C]}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
        {
            Map<String, Set<String>> result = getTopMeetingCompanions(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[]{new Employee("C")})
            ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:{}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
    }
}

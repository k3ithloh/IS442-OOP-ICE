
/**
 * Name : Keith Loh
 * Email: keith.loh.2021
 */
import java.util.*;
import labtest.Meeting;
import labtest.Employee;
import labtest.TimeSlot;

public class Q5 {

    public static Map<String, Set<String>> getTopMeetingCompanions(List<Meeting> meetings) {
        Map<String, Set<String>> result = new TreeMap<>();

        Map<String, Integer> employeeMatching = new TreeMap<>();
        for (Meeting meeting : meetings) {
            Employee[] meetingAttendees = meeting.getAttendees();
            Set<String> tempSet = new HashSet<>();
            // Create the employee matching
            for (int j = 0; j < meetingAttendees.length; j++) {
                for (int k = j + 1; k < meetingAttendees.length; k++) {
                    Employee e1 = meetingAttendees[j];
                    Employee e2 = meetingAttendees[k];

                    String e1Name = e1.getName();
                    String e2Name = e2.getName();

                    tempSet.add((e1Name + "-" + e2Name));
                    tempSet.add((e2Name + "-" + e1Name));
                }
            }
            for (String pairName : tempSet) {
                if (!employeeMatching.containsKey(pairName)) {
                    employeeMatching.put(pairName, 1);
                } else {
                    int currentValue = employeeMatching.get(pairName);
                    employeeMatching.put(pairName, currentValue + 1);
                }
            }
        }

        // System.out.println(employeeMatching);
        if (employeeMatching.equals(new TreeMap<>())) {
            return result;
        }

        int maxValue = Collections.max(employeeMatching.values());
        // System.out.println(maxValue);

        for (String key : employeeMatching.keySet()) {
            if (employeeMatching.get(key) == maxValue) {
                // System.out.println(key);
                String[] names = key.split("-");
                String pair1 = names[0];
                String pair2 = names[1];
                if (result.containsKey(pair1)) {
                    Set<String> tempSet2 = result.get(pair1);
                    tempSet2.add(pair2);
                    result.put(pair1, tempSet2);
                } else {
                    Set<String> tempSet2 = new TreeSet<>();
                    tempSet2.add(pair2);
                    result.put(pair1, tempSet2);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            Map<String, Set<String>> result = getTopMeetingCompanions(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                            new Employee[] {
                                    new Employee("B"),
                                    new Employee("C")
                            }),
                    new Meeting(
                            "M2",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[] {
                                    new Employee("A"),
                                    new Employee("D")
                            }),
                    new Meeting(
                            "M3",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[] { new Employee("B"), new Employee("C") }),
                    new Meeting(
                            "M4",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[] {
                                    new Employee("A"),
                                    new Employee("B"),
                                    new Employee("C"),
                                    new Employee("D")
                            })));
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
                            new Employee[] {
                                    new Employee("C"),
                                    new Employee("D")
                            }),
                    new Meeting(
                            "M2",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[] {
                                    new Employee("A"),
                                    new Employee("B")
                            }),
                    new Meeting(
                            "M3",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[] {
                                    new Employee("B"),
                                    new Employee("D")
                            }),
                    new Meeting(
                            "M4",
                            new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                            new Employee[] {
                                    new Employee("C"),
                                    new Employee("A"),
                                    new Employee("B"),
                                    new Employee("D")
                            })));
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
                            new Employee[] { new Employee("C") })));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:{}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
    }
}

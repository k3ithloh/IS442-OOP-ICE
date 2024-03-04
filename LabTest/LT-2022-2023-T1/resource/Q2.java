
/**
 * Name : Keith Loh
 * Email: keith.loh.2021@scis.smu.edu.sg
 */

import labtest.*;
import labtest.Employee;
import java.util.*;
import labtest.Meeting;
import labtest.TimeSlot;

public class Q2 {
        public static List<Employee> getCommonAttendees(Meeting meeting1, Meeting meeting2) {
                // Assume inputs are not null
                Employee[] meeting1Employees = meeting1.getAttendees();
                Employee[] meeting2Employees = meeting2.getAttendees();

                List<Employee> commonEmployees = new ArrayList<Employee>();

                for (Employee tempEmployee1 : meeting1Employees) {

                        for (Employee tempEmployee2 : meeting2Employees) {
                                if (tempEmployee1.equals(tempEmployee2)) {
                                        if (!commonEmployees.contains(tempEmployee1)) {
                                                commonEmployees.add(tempEmployee1);
                                        }
                                }
                        }
                }
                commonEmployees.sort(Comparator.comparing(Employee::getName));
                return commonEmployees;
        }

        // public static List<Employee> getCommonAttendees(Meeting m1, Meeting m2) {
        // Comparator<Employee> employeeNameComparator =
        // Comparator.comparing(Employee::getName);
        // Set<Employee> attendees1 = new TreeSet<>(employeeNameComparator);
        // attendees1.addAll(Arrays.asList(m1.getAttendees()));

        // Set<Employee> attendees2 = new TreeSet<>(employeeNameComparator);
        // attendees2.addAll(Arrays.asList(m2.getAttendees()));
        // attendees1.retainAll(attendees2);

        // return new ArrayList<>(attendees1);
        // }

        public static void main(String[] args) {
                int tcNum = 1;
                {
                        List<Employee> result = getCommonAttendees(
                                        new Meeting(
                                                        "M4",
                                                        new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                                        new Employee[] {
                                                                        new Employee("durian"),
                                                                        new Employee("apple"),
                                                                        new Employee("orange"),
                                                                        new Employee("pear") }),
                                        new Meeting(
                                                        "M6",
                                                        new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                                                        new Employee[] {
                                                                        new Employee("kiwi"),
                                                                        new Employee("banana"),
                                                                        new Employee("apple"),
                                                                        new Employee("coconut")
                                                        }));
                        System.out.printf("Test %d%n", tcNum++);
                        System.out.println("Expected:[apple]");
                        System.out.println("Actual  :" + result);
                        System.out.println();
                }
                {
                        List<Employee> result = getCommonAttendees(
                                        new Meeting(
                                                        "M1",
                                                        new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                                        new Employee[] {
                                                                        new Employee("persimmon"),
                                                                        new Employee("apple"),
                                                                        new Employee("durian"),
                                                                        new Employee("pear")
                                                        }),
                                        new Meeting(
                                                        "M2",
                                                        new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                                                        new Employee[] {
                                                                        new Employee("durian"),
                                                                        new Employee("pear"),
                                                                        new Employee("apple"),
                                                                        new Employee("durian")
                                                        }));
                        System.out.printf("Test %d%n", tcNum++);
                        System.out.println("Expected:[apple, durian, pear]");
                        System.out.println("Actual  :" + result);
                        System.out.println();
                }
                {
                        List<Employee> result = getCommonAttendees(
                                        new Meeting(
                                                        "M1",
                                                        new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00"),
                                                        new Employee[] {
                                                                        new Employee("persimmon"),
                                                                        new Employee("durian"),
                                                                        new Employee("apple"),
                                                                        new Employee("pear")
                                                        }),
                                        new Meeting(
                                                        "M2",
                                                        new TimeSlot("13/12/2022 12:00", "13/12/2022 13:00"),
                                                        new Employee[] {
                                                                        new Employee("guava"),
                                                                        new Employee("papaya"),
                                                                        new Employee("date"),
                                                                        new Employee("mango")
                                                        }));
                        System.out.printf("Test %d%n", tcNum++);
                        System.out.println("Expected:[]");
                        System.out.println("Actual  :" + result);
                        System.out.println();
                }

        }
}
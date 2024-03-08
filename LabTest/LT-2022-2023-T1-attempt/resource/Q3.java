/**
 * Name : Keith Loh
 * Email: keith.loh.2021@scis.smu.edu.sg
 */

import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;
import labtest.Meeting;
import labtest.Employee;
import labtest.TimeSlot;


public class Q3 {
    public static Map<String, Set<String>> getMeetingIdsOfIndividuals(Meeting[] meetings) {
            Map<String, Set<String>> meetingMap = new TreeMap<String, Set<String>>();
            for (Meeting meeting : meetings){
                Employee[] meetingAttendees = meeting.getAttendees();
                for (Employee employee : meetingAttendees){
                    String employeeName = employee.getName();
                    if (!meetingMap.containsKey(employeeName)){
                        Set<String> meetingIdSet = new TreeSet<>();
                        meetingIdSet.add(meeting.getId());
                        meetingMap.put(employeeName, meetingIdSet);
                    }
                    else{
                        Set<String> meetingIdSet = meetingMap.get(employeeName);
                        meetingIdSet.add(meeting.getId());
                        meetingMap.put(employeeName, meetingIdSet);
                    }
                }
            }
            return meetingMap;
        }

    public static void main(String[] args) {
            int tcNum = 1;
            {
                Map<String, Set<String>> result = getMeetingIdsOfIndividuals(
                    new Meeting[] {
                        new Meeting(
                                        "M12",
                                        new TimeSlot("12/12/2022 12:00",
                                                        "12/12/2022 13:00"),
                                        new Employee[] { new Employee("berry"),
                                                        new Employee("apple"),
                                                        new Employee("cherry") }) });
                System.out.printf("Test %d%n", tcNum++);
                System.out.println("Expected:{apple=[M12], berry=[M12], cherry=[M12]}");
                System.out.println("Actual  :" + result);
                System.out.println();
            }
            {
                Map<String, Set<String>> result = getMeetingIdsOfIndividuals(
                    new Meeting[] {
                        new Meeting(
                                        "M3",
                                        new TimeSlot("12/12/2022 12:00",
                                                        "12/12/2022 13:00"),
                                        new Employee[] { new Employee("orange"),
                                                        new Employee("durian") }),

                        new Meeting(
                                        "M1",
                                        new TimeSlot("12/12/2022 12:00",
                                                        "12/12/2022 13:00"),
                                        new Employee[] {
                                                        new Employee("durian"),
                                                        new Employee("apple"),
                                                        new Employee("orange"),
                                                        new Employee("pear") }),
                        new Meeting(
                                        "M2",
                                        new TimeSlot("13/12/2022 12:00",
                                                        "13/12/2022 13:00"),
                                        new Employee[] {
                                                        new Employee("durian"),
                                                        new Employee("pear"),
                                                        new Employee("apple") }) });
                    System.out.printf("Test %d%n", tcNum++);
                    System.out.println(
                                    "Expected:{apple=[M1, M2], durian=[M1, M2, M3], orange=[M1, M3], pear=[M1, M2]}");
                    System.out.println("Actual  :" + result);
                    System.out.println();
            }
    }
}

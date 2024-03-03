/**
 * Name :
 * Email:
 */

public class Q4 {
    public static List<Conflict> getConflicts(List<Meeting> scheduled) {
        return null;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        {
            List<Conflict> result = getConflicts(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00")),
                    new Meeting(
                            "M2",
                            new TimeSlot("12/12/2022 12:30", "12/12/2022 13:30"))
            ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:[(M1, M2)]");
            // sort your return value and print it
            if (result != null) {
                result.sort(Comparator.comparing((Conflict a) -> a.getMeeting1().getId())
                        .thenComparing(a -> a.getMeeting1().getId()));
            }
            System.out.println("Actual  :" + result);
            System.out.println();
        }
        {
            List<Conflict> result = getConflicts(List.of(
                    new Meeting(
                            "M1",
                            new TimeSlot("12/12/2022 12:00", "12/12/2022 13:00")),
                    new Meeting(
                            "M2",
                            new TimeSlot("12/12/2022 12:30", "12/12/2022 13:30")),
                    new Meeting(
                            "M3",
                            new TimeSlot("13/12/2022 11:30", "13/12/2022 12:30")),
                    new Meeting(
                            "M4",
                            new TimeSlot("12/12/2022 12:30", "12/12/2022 12:45"))
            ));
            System.out.printf("Test %d%n", tcNum++);
            System.out.println("Expected:[(M1, M2), (M1, M4), (M2, M4)]");
            // sort your return value and print it
            if (result != null) {
                result.sort(Comparator.comparing((Conflict a) -> a.getMeeting1().getId())
                        .thenComparing(a -> a.getMeeting1().getId()));
            }
            System.out.println("Actual  :" + result);
            System.out.println();
        }


    }
}

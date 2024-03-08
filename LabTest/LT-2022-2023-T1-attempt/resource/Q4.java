/**
 * Name : Keith Loh
 * Email: keith.loh.2021@scis.smu.edu.sg
 */
import java.util.*;
import labtest.Meeting;
import labtest.Conflict;
import labtest.TimeSlot;
import labtest.epoch.ScisDateTime;


public class Q4 {
    public static List<Conflict> getConflicts(List<Meeting> scheduled) {

        List<Conflict> result = new ArrayList<>();
        int j = 0;
        int k = 1;
        while ( j < scheduled.size()){
            if ( k >= scheduled.size()){
                j ++;
                k = j + 1;
                continue;
            }
            Meeting meetingj = scheduled.get(j);
            Meeting meetingk = scheduled.get(k);

            TimeSlot mJSlot = meetingj.getSlot();
            TimeSlot mKSlot = meetingk.getSlot();
            ScisDateTime mJStart = mJSlot.getStart();
            ScisDateTime mJEnd = mJSlot.getEnd();
            ScisDateTime mKStart = mKSlot.getStart();
            ScisDateTime mKEnd = mKSlot.getEnd();

            // Compare to see if the time overlaps
            if (!((mJStart.isBefore(mKStart) && mJEnd.isBefore(mKStart)) || (mJStart.isAfter(mKEnd) && mJEnd.isAfter(mKEnd)))){
                Conflict conflict = new Conflict(meetingj, meetingk);
                result.add(conflict);
            }
            k++;
        }
        return result;
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

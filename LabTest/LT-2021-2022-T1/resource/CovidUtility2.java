import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CovidUtility2 {

     public static Map<String,Long> getTotalTimeInOffice(List<Entry> entries, SimpleDate date){
        Map<String,Long> timeMap = new TreeMap<String, Long>();
        if (entries == null || entries.size() == 0){
                return timeMap;
        }
        
        for (Entry entry : entries){
                if (entry.getStartDateTime().getDate().equals(date)){
                       long timeSpent = entry.getStartDateTime().until(entry.getEndDateTime());
                       if (timeMap.containsKey(entry.getEmployeeId())){
                                long temp = timeMap.get(entry.getEmployeeId());
                                timeSpent += temp;
                                timeMap.put(entry.getEmployeeId(), timeSpent);
                       }
                       timeMap.put(entry.getEmployeeId(),timeSpent); 
                }
        }
        return timeMap;
        }
    public static void main(String[] args) {
        {
            List<Entry> entries = List.of(
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 1, 9, 0),
                            new SimpleDateTime(2021, 10, 1, 10, 0)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 1, 10, 0),
                            new SimpleDateTime(2021, 10, 1, 10, 30)),
                    new Entry("orange",
                            new SimpleDateTime(2021, 10, 1, 10, 0),
                            new SimpleDateTime(2021, 10, 1, 10, 23)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 3, 10, 0),
                            new SimpleDateTime(2021, 10, 3, 11, 0)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 2, 10, 0),
                            new SimpleDateTime(2021, 10, 2, 12, 0))
            );
            System.out.println("Test 1");
            System.out.println("Expected:{apple=90, orange=23}");
            Map<String,Long> result = getTotalTimeInOffice(entries, new SimpleDate(2021, 10, 1));
            System.out.println("Actual  :" + result);
            System.out.println();
        }

        {
            List<Entry> entries = List.of(
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 1, 9, 0),
                            new SimpleDateTime(2021, 10, 1, 10, 0)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 1, 10, 0),
                            new SimpleDateTime(2021, 10, 1, 11, 1)),
                    new Entry("durian",
                            new SimpleDateTime(2021, 10, 1, 10, 0),
                            new SimpleDateTime(2021, 10, 1, 10, 1)),
                    new Entry("durian",
                            new SimpleDateTime(2021, 10, 1, 10, 3),
                            new SimpleDateTime(2021, 10, 1, 10, 59))
            );
            System.out.println("Test 2");
            System.out.println("Expected:{apple=121, durian=57}");
            System.out.println("Actual  :" + getTotalTimeInOffice(entries, new SimpleDate(2021, 10, 1)));
            System.out.println();
        }

        {
            List<Entry> entries = List.of(
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 1, 9, 0),
                            new SimpleDateTime(2021, 10, 1, 10, 0)),
                    new Entry("apple",
                            new SimpleDateTime(2021, 10, 1, 10, 0),
                            new SimpleDateTime(2021, 10, 1, 11, 1)),
                    new Entry("durian",
                            new SimpleDateTime(2021, 10, 1, 10, 0),
                            new SimpleDateTime(2021, 10, 1, 10, 1)),
                    new Entry("durian",
                            new SimpleDateTime(2021, 10, 1, 10, 3),
                            new SimpleDateTime(2021, 10, 1, 10, 59))
            );
            System.out.println("Test 3");
            System.out.println("Expected:{}");
            System.out.println("Actual  :" + getTotalTimeInOffice(entries, new SimpleDate(2021, 10, 10)));
            System.out.println();
        }

        {
            System.out.println("Test 4");
            System.out.println("Expected:{}");
            System.out.println("Actual  :" + getTotalTimeInOffice(null, new SimpleDate(2021, 10, 10)));
            System.out.println();
        }


        {
            System.out.println("Test 5");
            System.out.println("Expected:{}");
            System.out.println("Actual  :" + getTotalTimeInOffice(new ArrayList<>(), new SimpleDate(2021, 10, 10)));
            System.out.println();
        }
    }
}

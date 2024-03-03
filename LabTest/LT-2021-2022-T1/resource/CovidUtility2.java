
public class CovidUtility2 {

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

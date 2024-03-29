
public class CovidUtility4 {


    public static void main(String[] args) {
        {
            List<Entry> entries = List.of(
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 1, 10, 0),
                            new SimpleDateTime(2021, 11, 1, 11, 0)
                    ),
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 2, 11, 10),
                            new SimpleDateTime(2021, 11, 2, 12, 0)
                    ),
                    new Entry("pear",
                            new SimpleDateTime(2021, 11, 3, 9, 30),
                            new SimpleDateTime(2021, 11, 3, 10, 5)
                    ),
                    new Entry("orange",
                            new SimpleDateTime(2021, 11, 1, 10, 30),
                            new SimpleDateTime(2021, 11, 1, 10, 40)
                    ),
                    new Entry("orange",
                            new SimpleDateTime(2021, 11, 1, 10, 55),
                            new SimpleDateTime(2021, 11, 1, 11, 55)
                    )
            );
            System.out.println("Test 1");
            System.out.println("Expected:[orange]");
            // Orange  (Total: 15 minutes)
            // 1. 10 minutes(10:30 - 10:40)
            // 2. 5 minutes (10:55 - 11:00)
            System.out.println("Actual  :" + Arrays.toString(getCloseContacts("apple", entries)));
            System.out.println();
        }

        {
            List<Entry> entries = List.of(
                    new Entry("durian",
                            new SimpleDateTime(2021, 11, 1, 10, 0),
                            new SimpleDateTime(2021, 11, 1, 11, 0)
                    ),
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 2, 10, 46),
                            new SimpleDateTime(2021, 11, 2, 12, 0)
                    )
            );
            System.out.println("Test 2");
            System.out.println("Expected:[]");
            System.out.println("Actual  :" + Arrays.toString(getCloseContacts("apple", entries)));
            System.out.println();
        }

        {
            List<Entry> entries = List.of(
                    new Entry("durian",
                            new SimpleDateTime(2021, 11, 1, 10, 0),
                            new SimpleDateTime(2021, 11, 1, 11, 0)
                    ),
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 1, 10, 46),
                            new SimpleDateTime(2021, 11, 1, 12, 0)
                    ),
                    new Entry("durian",
                            new SimpleDateTime(2021, 11, 2, 10, 0),
                            new SimpleDateTime(2021, 11, 2, 11, 0)
                    ),
                    new Entry("apple",
                            new SimpleDateTime(2021, 11, 2, 10, 46),
                            new SimpleDateTime(2021, 11, 2, 12, 0)
                    )
            );
            System.out.println("Test 2");
            System.out.println("Expected:[]");
            System.out.println("Actual  :" + Arrays.toString(getCloseContacts("apple", entries)));
            System.out.println();
        }

        {
            List<Entry> entries = List.of(
                    new Entry("durian",
                            new SimpleDateTime(2021, 11, 1, 10, 0),
                            new SimpleDateTime(2021, 11, 1, 11, 0)
                    ),
                    new Entry("durian",
                            new SimpleDateTime(2021, 11, 1, 14, 0),
                            new SimpleDateTime(2021, 11, 1, 15, 0)
                    ),
                    new Entry("durian",
                            new SimpleDateTime(2021, 11, 2, 10, 0),
                            new SimpleDateTime(2021, 11, 2, 11, 0)
                    ),
                    new Entry("orange",
                            new SimpleDateTime(2021, 11, 1, 10, 55),
                            new SimpleDateTime(2021, 11, 1, 11, 0)
                    ),
                    new Entry("orange",
                            new SimpleDateTime(2021, 11, 1, 12, 00),
                            new SimpleDateTime(2021, 11, 1, 14, 10)
                    ),
                    new Entry("pear",
                            new SimpleDateTime(2021, 11, 1, 10, 55),
                            new SimpleDateTime(2021, 11, 1, 11, 0)
                    ),
                    new Entry("pear",
                            new SimpleDateTime(2021, 11, 2, 10, 46),
                            new SimpleDateTime(2021, 11, 2, 14, 10)
                    )
            );
            System.out.println("Test 3");
            System.out.println("Expected:[orange]");
            // orange (total: 15 minutes)
            // 5 minutes (10:55 - 11:00)
            // 10 minutes (14:00 - 14:10)
            // pear spent 14 minutes (1 Nov) and 5 minutes (2 Nov) .. so not a close contact
            System.out.println("Actual  :" + Arrays.toString(getCloseContacts("durian", entries)));
            System.out.println();
        }
    }
}
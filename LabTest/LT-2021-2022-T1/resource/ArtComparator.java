
public class ArtComparator  {

    public static void main(String[] args) {
        {
            List<ArtTest> tests = List.of(
                    new ArtTest("bear", "CT", new SimpleDateTime(2021, 10, 10, 10, 10)),
                    new ArtTest("apple", "CT", new SimpleDateTime(2021, 10, 10, 10, 10)),
                    new ArtTest("car", "CT", new SimpleDateTime(2021, 10, 10, 10, 10)));

            tests = new ArrayList<>(tests);
            tests.sort(new ArtComparator());
            System.out.println("Expected:[apple(Positive, 10/10/2021 10:10), bear(Positive, 10/10/2021 10:10), car(Positive, 10/10/2021 10:10)]");
            System.out.println("Actual  :" + tests);
            System.out.println();
        }

        {
            List<ArtTest> tests = List.of(
                    new ArtTest("bear", "T", new SimpleDateTime(2021, 10, 10, 10, 10)),
                    new ArtTest("bear", "CT", new SimpleDateTime(2021, 10, 10, 10, 11)),
                    new ArtTest("bear", "C", new SimpleDateTime(2021, 10, 10, 10, 12)));

            tests = new ArrayList<>(tests);
            tests.sort(new ArtComparator());
            System.out.println("Expected:[bear(Invalid, 10/10/2021 10:10), bear(Positive, 10/10/2021 10:11), bear(Negative, 10/10/2021 10:12)]");
            System.out.println("Actual  :" + tests);
            System.out.println();
        }

        {
            List<ArtTest> tests = List.of(
                    new ArtTest("bear", "T", new SimpleDateTime(2021, 10, 10, 10, 10)),
                    new ArtTest("bear", "CT", new SimpleDateTime(2021, 10, 10, 10, 10)),
                    new ArtTest("bear", "C", new SimpleDateTime(2021, 10, 10, 10, 10)));

            tests = new ArrayList<>(tests);
            tests.sort(new ArtComparator());
            System.out.println("Expected:[bear(Negative, 10/10/2021 10:10), bear(Positive, 10/10/2021 10:10), bear(Invalid, 10/10/2021 10:10)]");
            System.out.println("Actual  :" + tests);
            System.out.println();
        }
    }
}

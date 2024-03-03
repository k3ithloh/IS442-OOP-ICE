import java.util.*;

public class ArtComparator implements Comparator<ArtTest> {
//In the provided ArtComparator implementation, you are defining a custom sorting logic for ArtTest objects based on three criteria: employeeId, date, and the test's validity. The compare method is overridden to specify how two ArtTest objects should be compared to each other according to these criteria. Here's a breakdown of what you're doing and the rationale behind the return values:

// Comparing employeeId
// What you're doing: You first compare the employeeId of two ArtTest objects (o1 and o2). The String.compareTo method is used, which naturally orders strings in ascending order.
// Why return values from compareTo: The compareTo method returns a negative integer, zero, or a positive integer as the first string is less than, equal to, or greater than the second. This directly aligns with the comparator contract, making it suitable for sorting employeeId in ascending order.

// Comparing date
// What you're doing: If the employeeId values are identical (i.e., employeeIdCompare is 0), you then compare the date of the two objects. Again, you use the compareTo method, assuming that the date field implements the Comparable interface.
// Why return values from compareTo: Similar to employeeId, the compareTo method for dates returns a value that indicates the chronological order of the dates, fulfilling the requirement to sort dates in ascending order.
// Comparing Test's Validity
// What you're doing: If both employeeId and date are identical, you finally compare the tests' validity using a custom method getValidityInt.
// !art.isValid(): Returns 1 for invalid tests, placing them last.
// art.isNegative(): Returns -1 for negative tests, placing them first.
// Otherwise: Returns 0 for positive tests, placing them in the middle.
// Why these return values: The sorting order for validity is negative, positive, then invalid. The return values from getValidityInt are designed to create this specific order when subtracted (getValidityInt(o1) - getValidityInt(o2)). By returning -1 for negative (to prioritize them over others), 0 for positive (to place them in the middle), and 1 for invalid (to place them last), you ensure the correct sorting order when these values are used in subtraction.

// Summary
// The return values of 1, -1, and 0 from getValidityInt and the use of compareTo for employeeId and date comparisons are integral to fulfilling the sorting criteria specified. The compare method must return a negative integer, zero, or a positive integer if the first argument is less than, equal to, or greater than the second, respectively. This is exactly what your implementation achieves through its use of compareTo and the custom logic in getValidityInt.


    private int getValidityInt(ArtTest art) {
        if (!art.isValid()) {
            return 1;
        }
        if (art.isNegative()) {
            return -1;
        }
        return 0;
    }

    @Override
    public int compare(ArtTest o1, ArtTest o2) {
        // first thing to compare is the employee id
        int employeeIdCompare = o1.getEmployeeId().compareTo(o2.getEmployeeId());
        if (employeeIdCompare != 0) {
            return employeeIdCompare;
        }

        int dateCompare = o1.getDate().compareTo(o2.getDate());
        if (dateCompare != 0) {
            return dateCompare;
        }

        return getValidityInt(o1) - getValidityInt(o2);
    }

    public static void main(String[] args) {
        {
            List<ArtTest> tests = List.of(
                    new ArtTest("bear", "CT", new SimpleDateTime(2021, 10, 10, 10, 10)),
                    new ArtTest("apple", "CT", new SimpleDateTime(2021, 10, 10, 10, 10)),
                    new ArtTest("car", "CT", new SimpleDateTime(2021, 10, 10, 10, 10)));

            tests = new ArrayList<>(tests);
            tests.sort(new ArtComparator());
            System.out.println(
                    "Expected:[apple(Positive, 10/10/2021 10:10), bear(Positive, 10/10/2021 10:10), car(Positive, 10/10/2021 10:10)]");
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
            System.out.println(
                    "Expected:[bear(Invalid, 10/10/2021 10:10), bear(Positive, 10/10/2021 10:11), bear(Negative, 10/10/2021 10:12)]");
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
            System.out.println(
                    "Expected:[bear(Negative, 10/10/2021 10:10), bear(Positive, 10/10/2021 10:10), bear(Invalid, 10/10/2021 10:10)]");
            System.out.println("Actual  :" + tests);
            System.out.println();
        }
    }
}

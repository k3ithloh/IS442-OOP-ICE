import java.util.Comparator;

/**
 * This class help to sort Staffs.
 */
public class Sorter implements Comparator<Staff> {

    /**
     * Compare 2 Staffs by the sorting criteria.
     *
     * @param e1 Staff object
     * @param e2 Staff object
     * @return If e1 is less than, equals or more than e2, return a negative
     *         value, zero or positive value respectively. If sorting criteria is
     *         null or
     *         empty, it returns zero.
     */
    public

    @Override public int compare(Staff e1, Staff e2) {
        return 0;
    }

    // @Override
    // public int compare(Staff e1, Staff e2) {
    // for (Criterion criterion : criteria) {
    // int comparisonResult = 0;
    // switch (criterion.getField()) {
    // case Criterion.NAME:
    // comparisonResult = e1.getName().compareTo(e2.getName());
    // break;
    // // Add cases for SCHOOL, YEAR, and CLASS
    // }
    // if (comparisonResult != 0) {
    // return criterion.isAscending() ? comparisonResult : -comparisonResult;
    // }
    // }
    // return 0;
    // }

    /**
     * Sort Staffs.
     * 
     * @param Staffs List of Staff objects to be sorted.
     */
    public void sort(Staff[] Staffs) {

    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Section {
    private String number;
    private Course course;
    private Staff[] staff;

    public Section(String number, Course course, Staff[] staff) {
        this.number = number;
        this.course = course;
        this.staff = staff;
    }

    public String getNumber() {
        return number;
    }

    public Course getCourse() {
        return course;
    }

    public Staff[] getStaff() {
        return staff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Section) {
            Section newO = (Section) o;
            if (this.getCourse().equals(newO.getCourse())) {
                // check if Staff[] is the same length for both
                Staff[] staffArray = this.getStaff();
                Staff[] staffArray2 = newO.getStaff();
                if (staffArray.length == staffArray2.length) {
                    List<Staff> staffList2 = Arrays.asList(staffArray2);
                    for (Staff staffMember : staffArray) {
                        if (!staffList2.contains(staffMember)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }

        return false;
    }

    public int hashCode() {
        return 0;
    }
}

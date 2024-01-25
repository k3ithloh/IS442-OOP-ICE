import java.util.*;

public class EmployeeSortingTest {
  public static void main(String[] args) {
    ArrayList<Employee> empList = new ArrayList<Employee>();
    empList.add(new Employee ("Peter", 5000));
    empList.add(new Employee("Zack", 3000));
    Collections.sort(empList);
    for (int i=0;i<empList.size();i++){
      System.out.println(empList.get(i));
    }
  }
}

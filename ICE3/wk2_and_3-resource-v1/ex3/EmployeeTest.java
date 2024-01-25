public class EmployeeTest {
  public static void main(String[] args) {
    Manager m = new Manager("Peter", 5000, 2000);
    Employee e = new Employee("John", 3000);
    System.out.println("Manager's salary : " + m.getGrossSalary());
    System.out.println("Employee's salary : " + e.getGrossSalary());
  }
}
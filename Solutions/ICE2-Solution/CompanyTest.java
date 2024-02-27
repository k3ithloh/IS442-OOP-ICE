import java.util.Scanner;

import javax.print.attribute.standard.OrientationRequested;

public class CompanyTest {

    public static void main(String[] args) {
        // a and b
        Company comp = new Company("UMS");
        comp.addEmployee(new Employee("John", 5, 2500, 'M', new Spouse("Kate", 37)));

        //c
        System.out.printf("Total salary (before): $%.1f\n", comp.getAllEmployeesSalary());

        System.out.println();

        //d
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter gender: ");
        sc.nextLine();
        char gender = sc.nextLine().charAt(0);
        comp.addEmployee(new Employee(name, id, salary, gender));

        System.out.println();

        //e
        System.out.printf("Total salary (after addition): $%.1f\n", comp.getAllEmployeesSalary());

        System.out.println();

        //f and g
        checkEmployee(comp, 4);
        System.out.println();

        checkEmployee(comp, 5);
    }

    //h
    public static void checkEmployee(Company comp, int id) {
        Employee emp = comp.getEmployee(id);
        System.out.printf("Name: %s, Salary: $%.2f, Status: %s\n", emp.getName(), emp.getSalary(), emp.getSpouse() == null ? "Single" : "Married");

        if (emp.getSpouse() != null) {
            System.out.printf("Spouse's name: %s\n", emp.getSpouse().getName());
        }
    }
}

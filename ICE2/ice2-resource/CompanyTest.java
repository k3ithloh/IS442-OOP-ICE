import java.util.Scanner;

public class CompanyTest {

    public static void checkEmployee(Company comp, int id){
        Employee tempE = comp.getEmployee(id);
        Spouse tempS = tempE.getSpouse();
        if (tempS != null){
            System.out.printf("Name: %s, Salary is %.2f, Status: Married\n", tempE.getName(), tempE.getSalary());
            System.out.printf("Spouse's name is %s\n", tempS.getName());
        }
        else {
            System.out.printf("Name: %s, Salary is %.2f, Status: Single\n", tempE.getName(), tempE.getSalary());
        }
    }

    public static void main(String[] args) {
        // * Question 5A
        Company ums = new Company("UMS");

        System.out.println(String.valueOf(ums.numberOfEmployees()));

        // * Question 5B
        Spouse kate = new Spouse("Kate", 37);
        Employee john = new Employee("John", 5, 2500, 'M', kate);
        ums.addEmployee(john);
        System.out.println(String.valueOf(ums.numberOfEmployees()));

        // * Question 5C
        // System.out.println(String.format("Total employees salary: %.2f", ums.getAllEmployeesSalary()));
        // ! FOR 2 DP using printf
        System.out.printf("Total salary(before): %.2f\n", ums.getAllEmployeesSalary());

        // * Question 5D
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter salary: ");
        float salary = sc.nextFloat();
        System.out.println("Enter gender: ");
        char gender = sc.next().charAt(0);

        Employee newEmp = new Employee(name,employeeID,salary,gender);
        ums.addEmployee(newEmp);

        // ! Just too double confirm
        System.out.println(String.valueOf(ums.numberOfEmployees()));
        
        // * Question 5E
        // * Print total Salary of company
        System.out.printf("\nTotal salary (after addition) :$%.2f\n\n", ums.getAllEmployeesSalary());

        // * Question 5F
        Employee tempEmp = ums.getEmployee(4);

        System.out.printf("Name: %s, Salary: %.2f\n\n", tempEmp.getName(), tempEmp.getSalary());

        // * Question 5G
        Employee tempEmp2 = ums.getEmployee(5);
        Spouse tempSpouse = tempEmp2.getSpouse();
        if (tempSpouse != null){
            System.out.printf("Name: %s, Salary: %.2f, Status: Married\n", tempEmp2.getName(), tempEmp2.getSalary());
            System.out.printf("Spouse's name is %s\n", tempSpouse.getName());
        }
        else{
            System.out.printf("Name: %s, Salary: %.2f, Status: Single\n", tempEmp2.getName(), tempEmp2.getSalary());
        }

        // * Question 5H REDO F,G using checkEmployee
        System.out.println("\nQuestion 5H\n");
        checkEmployee(ums, 4);
        checkEmployee(ums, 5);
        
    }


}

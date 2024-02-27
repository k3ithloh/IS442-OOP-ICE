import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of the first person:");

        System.out.print("Enter first name : ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name : ");
        String lastName = sc.nextLine();

        System.out.print("Enter age : ");
        int age = sc.nextInt();
        sc.nextLine();

        Person person1 = new Person(firstName, lastName, age);
        System.out.println(person1.toString());

        System.out.println("Enter details of the second person:");

        System.out.print("Enter first name : ");
        String firstName2 = sc.nextLine();

        System.out.print("Enter last name : ");
        String lastName2 = sc.nextLine();

        // System.out.print("Enter age : ");
        // age = sc.nextInt();

        Person person2 = new Person(firstName2, lastName2);
        System.out.println(person2.toString());

        System.out.print("Enter age of second person : ");
        int age2 = sc.nextInt();

        person2.setAge(age2);
        System.out.println(person2.toString());
    }
}
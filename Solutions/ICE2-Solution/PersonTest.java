import java.util.Scanner;

public class PersonTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Person aPerson = initialisePerson(sc, "first");
        //c
        System.out.println(aPerson);

        System.out.println();
        
        Person otherPerson = initialisePerson(sc, "second", false);
        //f
        System.out.println(otherPerson);

        System.out.println();

        //g
        System.out.print("Enter age of second person : ");
        int newAge = sc.nextInt();
        otherPerson.setAge(newAge);

        System.out.println();

        System.out.println("After setting age of otherPerson");
        System.out.println(otherPerson);

        sc.close();
    }

    private static Person initialisePerson(Scanner sc, String index) {
        return initialisePerson(sc, index, true);
    }

    private static Person initialisePerson(Scanner sc, String index, boolean hasAge) {

        System.out.printf("Enter details of the %s person:\n", index);
        System.out.print("Enter first name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name : ");
        String lastName = sc.nextLine();
        
        Person person;

        if (hasAge) {
            System.out.print("Enter age : ");
            int age = sc.nextInt();
            sc.nextLine();
            person = new Person(firstName, lastName, age);
        } else {
            person = new Person(firstName, lastName);
        }        

        return person;
    }
}

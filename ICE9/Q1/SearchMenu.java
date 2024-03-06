import java.util.Scanner;

public class SearchMenu {
    private SearchCtrl ctrl;

    public SearchMenu(SearchCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Interest Group Management System ==");
        System.out.println("1. President Gender Search");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice:");
    }
    
    public void readOption() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            display();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Interest Group's name>");
                    String interestGrpName = sc.nextLine();
                    System.out.print("Enter the year >");
                    int year = sc.nextInt();
                    sc.nextLine();
                    searchPresident(interestGrpName, year);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
        sc.close();
    }

    public void searchPresident(String interestGrpName, int year) {
        Student studentPresident = ctrl.searchPresident(interestGrpName, year);
        if (studentPresident != null ){
            String studentName = studentPresident.getName();
            char studentGender = studentPresident.getGender();
            String studentPronouns = "";
            if (studentGender == 'M'){
                studentPronouns = "gentleman";
            }
            else if (studentGender == 'F'){
                studentPronouns = "lady";
            }
            System.out.println("The president " + studentName + "is a " + studentPronouns);
        }
        else {
            System.out.println("Invalid Interest Group/Year entered.");
        }
        
    }
}
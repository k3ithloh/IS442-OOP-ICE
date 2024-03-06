import java.util.Scanner;

public class CheckMembershipMenu {
    private CheckMembershipCtrl ctrl;

    public CheckMembershipMenu(CheckMembershipCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Team Management System ==");
        System.out.println("1. Check student's team enrolment");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice: ");
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            display();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 :
                    System.out.print("Enter the student's name> ");
                    String studentName = sc.nextLine();
                    System.out.print("Enter the team's name> ");
                    String teamName = sc.nextLine();

                    checkMembershipDuration(studentName, teamName);
                    break;
                case 2 :
                    System.out.println("bye bye");
                    break;
                default :
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
        
    }

    // complete the checkMembershipDuration method here
    public void checkMembershipDuration(String studentName, String teamName){
        int membershipDuration = this.ctrl.checkMembershipDuration(teamName, studentName);

        if (membershipDuration == -1){
            System.out.printf("%s is not in the team %s.", studentName, teamName);
            System.out.println("");
            System.out.println("");
        }
        else if (membershipDuration == 0){
            System.out.printf("%s joined the team when the team is formed.", studentName);
            System.out.println("");
            System.out.println("");
        }
        else {
            System.out.printf("%s joined the team %t days after the team is formed", studentName, membershipDuration);
            System.out.println("");
            System.out.println("");
        }
    }
}
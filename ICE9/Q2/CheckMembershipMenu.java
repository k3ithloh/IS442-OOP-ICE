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
                    System.out.println("Enter the team's name");
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
        int timeDifference = this.ctrl.checkMembershipDuration(teamName, studentName);

        if ()
    }
}
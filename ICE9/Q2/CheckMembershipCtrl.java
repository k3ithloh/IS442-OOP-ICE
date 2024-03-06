
public class CheckMembershipCtrl {
    private TeamDAO teamDAO;

    public CheckMembershipCtrl() {
        teamDAO = new TeamDAO();
    }

    // complete the checkMembershipDuration method here
    public int checkMembershipDuration(String teamName, String studentName){
        Team team = null;
        TMSDate dateFormed = null;

        try {
            team = teamDAO.retrieve(teamName);
            dateFormed = team.getDateFormed();
        }
        catch (NullPointerException e){
            return -1;
        }

        try {
            Student student = team.retrieve(studentName);
            TMSDate studentDateJoined = student.getDateJoined();

            int timeDifference = dateFormed.calculateDifference(studentDateJoined);

            return timeDifference;
        }
        catch (NullPointerException e){
            return -1;
        }
    }
}

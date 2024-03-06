
public class CheckMembershipCtrl {
    private TeamDAO teamDAO;

    public CheckMembershipCtrl() {
        teamDAO = new TeamDAO();
    }

    // complete the checkMembershipDuration method here
    public int checkMembershipDuration(String teamName, String studentName){
        try {
            Team team = teamDAO.retrieve(teamName);
            TMSDate dateFormed = team.getDateFormed();
            
            try {
                Student student = team.retrieve(studentName);
                TMSDate studentDateJoined = student.getDateJoined();
            }
            catch (NullPointerException e){

            }
        catch (NullPointerException error2){
            // return -1
        }

        int timeDifference = dateFormed.calculateDifference(studentDateJoined);

        return timeDifference;
        }
            
    }
}

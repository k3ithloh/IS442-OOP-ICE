import java.util.*;

public class ProjectManager extends Employee {

    private ArrayList<Project> projects;

    public ProjectManager(String name, String joinedDate) {
        super(name, joinedDate);
        this.projects = new ArrayList<>();
    }

    public ProjectManager(String name, String joinedDate, double salary) {
        super(name, joinedDate, salary);
        this.projects = new ArrayList<>();
    }

    public ProjectManager(String name, String joinedDate, ArrayList<Project> projects) {
        super(name, joinedDate);
        this.projects = projects;
    }

    public void addProject(Project proj) {

        if (proj != null) {
            if (proj instanceof Project) {
                projects.add(proj);
            }
        }
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public int getProjectWorth() {
        int totalWorth = 0;
        for (int i = 0; i < projects.size(); i++) {
            Project tempProj = projects.get(i);
            if (tempProj.isCompleted()) {
                totalWorth += tempProj.getWorth();
            }
        }
        return totalWorth;
    }

    public double getBonus() {
        return 0.01 * getProjectWorth();
        // double totalWorth = 0.0;
        // for (int i = 0; i < projects.size(); i++) {
        // Project tempProj = projects.get(i);
        // if (tempProj.isCompleted()) {
        // totalWorth += tempProj.getWorth();
        // }
        // }
        // if (totalWorth != 0.0) {
        // return totalWorth * (1 / 100);
        // }
        // return totalWorth;
    }

    public void removeProject(Project proj) {
        projects.remove(proj);
    }

    // @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectManager)) {
            return false;
        }
        // if (!super.equals(obj)) {
        // return false;
        // }

        ProjectManager another = (ProjectManager) obj;
        Collections.sort(another.projects);
        Collections.sort(projects);
        // return Objects.equals(projects, another.projects);
        return super.equals(another) && projects.equals(another.projects);
    }

    // @Override
    public String toString() {
        return "[Name: " + getName() +
                ", type: Project Manager" +
                ", JoinedDate: " + getJoinYearMonth() +
                ", projects worth: " + getProjectWorth() + "]";
    }
}

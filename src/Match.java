import java.util.Arrays;

public class Match {
    private Group group;
    private String teams;
    private String dateTime;

    public Match(Group group, String teams, String dateTime) {
        this.group = group;
        this.teams = teams;
        this.dateTime = dateTime;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Match{" +
                "group=" + group +
                ", teams=" + teams +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}

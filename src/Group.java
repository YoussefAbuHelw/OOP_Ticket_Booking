import java.util.Arrays;

public class Group {
    private String name;
    private Team[] teams;
    private Stadium stadium;

    public Group(String name, Team[] teams, Stadium stadium) {
        this.name = name;
        this.teams = teams;
        this.stadium = stadium;
    }

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team[] getTeam() {
        return teams;
    }

    public void setTeam(Team[] team) {
        this.teams = team;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return "Group{" + "name='" + name + '\'' + ", team=" + Arrays.toString(teams) +'}';
    }
}

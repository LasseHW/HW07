package Task2;

import java.util.ArrayList;
import java.util.List;

public class OlympicsTeams implements Team {

    private List<Team> subTeams;
    private String name;

    public OlympicsTeams(String name) {
        this.name = name;
        this.subTeams = new ArrayList<>();
    }

    public void printNameAndNumberGM() {
        for (Team sub : subTeams) {
            sub.printNameAndNumberGM();

        }
    }

    public void printNameAndNumberOfAthletes() {
        for (Team sub : subTeams) {
            sub.printNameAndNumberOfAthletes();
        }
    }

    public void addTeam(Team t) {
        subTeams.add(t);


    }

    public void removeTeam(Team t) {
        subTeams.remove(t);
    }


}

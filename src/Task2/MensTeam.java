package Task2;

import java.util.ArrayList;
import java.util.List;

public class MensTeam implements Team {
    private String name;
    private List<Team> subTeams;

    public MensTeam(String name) {
        this.name = name;

        subTeams = new ArrayList<>();
    }

    @Override
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

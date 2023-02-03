package Task21;



import java.util.ArrayList;
import java.util.List;

public class CompositeTeam2 implements Task2.Team {
    private String name;


    private List<Task2.Team> subTeams;

    public CompositeTeam2(String name) {
        this.name = name;
        subTeams = new ArrayList<>();
    }

    @Override
    public void printNameAndNumberGM() {
        for (Task2.Team sub : subTeams) {
            sub.printNameAndNumberGM();

        }
    }

    public void printNameAndNumberOfAthletes() {
        for (Task2.Team sub : subTeams) {
            sub.printNameAndNumberOfAthletes();
        }
    }
    public void addTeam(Task2.Team t) {
        subTeams.add(t);


    }

    public void removeTeam(Team2 t) {
        subTeams.remove(t);
    }

}


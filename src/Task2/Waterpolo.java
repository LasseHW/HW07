package Task2;

public class Waterpolo implements Team {
    private String name;
    private int numberOfGM;
    private int numberOfAthletes;


    public Waterpolo(String name, int numberOfGM, int numberOfAthletes) {
        this.name = name;
        this.numberOfGM = numberOfGM;
        this.numberOfAthletes = numberOfAthletes;

    }

    @Override
    public void printNameAndNumberGM() {
        System.out.println("Team:" + name + ", Number of Gold Medallists: " + numberOfAthletes);

    }

    public void printNameAndNumberOfAthletes() {
        System.out.println("Team:" + name + ", Number of Athletes: " + numberOfAthletes);
    }

}

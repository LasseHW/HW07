package Task2;

import java.util.ArrayList;
import java.util.List;

public class Cycling implements Team{
    private String name;
    private int numberOfGM;
    private int numberOfAthletes;


    public Cycling(String name, int numberOfGM, int numberOfAthletes) {
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

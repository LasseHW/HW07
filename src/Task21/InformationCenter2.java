package Task21;

import Task2.CompositeTeam;
import Task2.LeafTeam;

public class InformationCenter2 {

    public static void main(String[] args) {
        LeafTeam c = new LeafTeam("Cycling", 8, 2);
        LeafTeam t = new LeafTeam("Tennis", 6, 5);
        LeafTeam tT = new LeafTeam("Table-Tennis", 3, 2);
        LeafTeam fB = new LeafTeam("Football", 1, 2);
        Task2.CompositeTeam gWT = new Task2.CompositeTeam("German Women's Team");
        Task2.CompositeTeam gMT = new Task2.CompositeTeam("Germany Men's Team");
        Task2.CompositeTeam GT = new Task2.CompositeTeam("Germany Team");
        Task2.CompositeTeam eP = new Task2.CompositeTeam("Europe Team");
        LeafTeam tk = new LeafTeam("Teakwondo", 1, 1);
        LeafTeam wP = new LeafTeam("Waterpolo", 1, 1);
        LeafTeam aG = new LeafTeam("Artistic-Gymnastics", 1, 19);
        LeafTeam sH = new LeafTeam("Shooting", 1, 3);
        Task2.CompositeTeam wT = new Task2.CompositeTeam("China Women's Team");
        Task2.CompositeTeam mT = new Task2.CompositeTeam("China Men's Team");
        Task2.CompositeTeam cT = new Task2.CompositeTeam("China Team");
        Task2.CompositeTeam aT = new Task2.CompositeTeam("Asia Team");
        Task2.CompositeTeam oT = new CompositeTeam("Olympics Team");
        gMT.addTeam(c);
        gMT.addTeam(t);
        gWT.addTeam(tT);
        gWT.addTeam((fB));
        GT.addTeam(gMT);
        GT.addTeam(gWT);
        wT.addTeam(tk);
        wT.addTeam(wP);
        wT.addTeam(aG);
        mT.addTeam(sH);
        cT.addTeam(wT);
        cT.addTeam(mT);
        aT.addTeam(cT);
        eP.addTeam(GT);
        oT.addTeam(aT);
        oT.addTeam(eP);
        System.out.println("a.");
        GT.printNameAndNumberOfAthletes();
        System.out.println("b.");
        GT.printNameAndNumberGM();
        System.out.println("c.");
        aT.printNameAndNumberGM();
        System.out.println("d.");
        oT.printNameAndNumberOfAthletes();

    }
}


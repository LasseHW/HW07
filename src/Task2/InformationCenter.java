package Task2;

public class InformationCenter {

    public static void main(String[] args) {
        LeafTeam c = new LeafTeam("Cycling", 8, 2);
        LeafTeam t = new LeafTeam("Tennis", 6, 5);
        LeafTeam tT = new LeafTeam("Table-Tennis", 3, 2);
        LeafTeam fB = new LeafTeam("Football", 1, 2);
        CompositeTeam gWT = new CompositeTeam("German Women's Team");
        CompositeTeam gMT = new CompositeTeam("Germany Men's Team");
        CompositeTeam GT = new CompositeTeam("Germany Team");
        CompositeTeam eP = new CompositeTeam("Europe Team");
        LeafTeam tk = new LeafTeam("Teakwondo", 1, 1);
        LeafTeam wP = new LeafTeam("Waterpolo", 1, 1);
        LeafTeam aG = new LeafTeam("Artistic-Gymnastics", 1, 19);
        LeafTeam sH = new LeafTeam("Shooting", 1, 3);
        CompositeTeam wT = new CompositeTeam("China Women's Team");
        CompositeTeam mT = new CompositeTeam("China Men's Team");
        CompositeTeam cT = new CompositeTeam("China Team");
        CompositeTeam aT = new CompositeTeam("Asia Team");
        CompositeTeam oT = new CompositeTeam("Olympics Team");
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

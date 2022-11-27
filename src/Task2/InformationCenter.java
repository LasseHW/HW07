package Task2;

public class InformationCenter {

    public static void main(String[] args) {
        Cycling c = new Cycling("Cycling", 8, 2);
        Tennis t = new Tennis("Tennis", 6, 5);
        TableTennis tT = new TableTennis("Table-Tennis", 3, 2);
        Football fB = new Football("Football", 1, 2);
        GTWomensTeam gWT = new GTWomensTeam("German Women's Team");
        GTMensTeam gMT = new GTMensTeam("Germany Men's Team");
        GermanyTeam GT = new GermanyTeam("Germany Team");
        EuropeTeam eP = new EuropeTeam("Europe Team");
        Teakwondo tk = new Teakwondo("Teakwondo", 1, 1);
        Waterpolo wP = new Waterpolo("Waterpolo", 1, 1);
        ArtisticsGymnastics aG = new ArtisticsGymnastics("Artistic-Gymnastics", 1, 19);
        Shooting sH = new Shooting("Shooting", 1, 3);
        WomensTeam wT = new WomensTeam("China Women's Team");
        MensTeam mT = new MensTeam("China Men's Team");
        ChinaTeam cT = new ChinaTeam("China Team");
        AsiaTeam aT = new AsiaTeam("Asia Team");
        OlympicsTeams oT = new OlympicsTeams("Olympics Team");
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

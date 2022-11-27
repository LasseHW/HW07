package Task1;

public class CostCalculator implements Visitor {

    @Override
    public void visitElectronic(Electronic e) {
        double costs = 0;
        double a = (double) e.getWeight() / 10;
        double b = (double) e.getWeight() / 15;
        if (e.getFragile()) {
            costs = a * 5;
        } else {
            costs = b * 5;
        }
        System.out.println("Total cost for " + e.getName() + " is: " + costs + " Euros");
    }

    @Override
    public void visitFurniture(Furniture f) {
        double a = (double) f.getWeight() / 20;
        double costs = a * 5;

        System.out.println("Total Cost for " + f.getName() + " is: " + costs + " Euros");

    }

    @Override
    public void visitGlass(Glass g) {
        int thickness = g.getTickness();
        double costs = 0;
        switch (thickness) {
            case 1:
                costs = (double) (2 * g.lenght) / 100;
                break;
            case 2:
                costs = (double) (1.2 * g.lenght) / 100;
                break;
            case 3:
                costs = (double) (0.7 * g.lenght) / 100;
                break;
            default:
                System.out.println(" Wrong value for Thickness!");
        }
        System.out.println("Total cost for " + g.getName() + " is: " + costs + " Euros");

    }


    public void calculateCosts(HouseholdItem h) {

        h.accept(this);

    }
}

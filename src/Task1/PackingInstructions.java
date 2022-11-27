package Task1;

public class PackingInstructions implements Visitor {

    public void visitGlass(Glass g) {
        System.out.println("> should be wrapped with Bubble wraps and packed in a box with dimensions:"
                + (g.getHeight() + 1) + "x" + (g.getLenght() + 1) + "x" + (g.getWidth() + 1));
    }

    public void visitElectronic(Electronic e) {
        System.out.println("> should be covered with Polyethylene foam film and packed in a box widh dimensions: "
                + (e.getHeight() + 1) + "x" + (e.getLenght() + 1) + "x" + (e.getWidth() + 1));
    }

    public void visitFurniture(Furniture f) {
        System.out.println("Should be covered with waterproof covers with area of:" + f.getLenght() + "x" + f.getWidth());
    }

    public void getPackingInstructions(HouseholdItem h) {
        h.accept(this);
    }
}

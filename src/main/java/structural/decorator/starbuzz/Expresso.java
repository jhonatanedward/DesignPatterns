package structural.decorator.starbuzz;

public class Expresso extends Beverage{

    public Expresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

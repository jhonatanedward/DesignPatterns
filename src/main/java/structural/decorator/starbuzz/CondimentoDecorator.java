package structural.decorator.starbuzz;

public abstract class CondimentoDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
}

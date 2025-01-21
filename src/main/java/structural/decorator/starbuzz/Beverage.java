package structural.decorator.starbuzz;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI}
    Size size = Size.TALL;
    String description = "";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
    public Size getSize() {
        return this.size;
    }
}

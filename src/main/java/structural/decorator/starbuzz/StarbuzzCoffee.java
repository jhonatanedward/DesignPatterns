package structural.decorator.starbuzz;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        beverage.size = Beverage.Size.VENTI;
        Beverage aa = new Soy(beverage);
        System.out.println(beverage.getDescription() + " $" + aa.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}

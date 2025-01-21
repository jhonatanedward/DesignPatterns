package creational.Factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for(String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    void cute() {
        System.out.println("Cutting the pizza int diagonal slices");
    }
    void box() {
        System.out.println("Place pizza inf official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

}

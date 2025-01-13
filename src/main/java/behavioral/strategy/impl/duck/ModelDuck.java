package behavioral.strategy.impl.duck;

import behavioral.strategy.impl.behaviors.FlyNoWay;
import behavioral.strategy.impl.behaviors.Quack;
import behavioral.strategy.model.Duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}

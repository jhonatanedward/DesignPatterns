package criational.strategy.impl.duck;

import criational.strategy.impl.behaviors.FlyNoWay;
import criational.strategy.impl.behaviors.Quack;
import criational.strategy.model.Duck;

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

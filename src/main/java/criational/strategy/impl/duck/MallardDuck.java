package criational.strategy.impl.duck;

import criational.strategy.impl.behaviors.FlyWithWings;
import criational.strategy.impl.behaviors.Quack;
import criational.strategy.model.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}

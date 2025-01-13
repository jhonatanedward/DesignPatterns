package behavioral.strategy.impl.behaviors;

import behavioral.strategy.model.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

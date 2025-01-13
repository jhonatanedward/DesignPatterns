package behavioral.strategy.impl.behaviors;

import behavioral.strategy.model.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}

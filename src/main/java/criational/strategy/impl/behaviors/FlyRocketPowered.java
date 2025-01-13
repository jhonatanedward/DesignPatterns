package criational.strategy.impl.behaviors;

import criational.strategy.model.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}

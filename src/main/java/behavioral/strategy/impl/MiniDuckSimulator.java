package behavioral.strategy.impl;

import behavioral.strategy.impl.behaviors.FlyRocketPowered;
import behavioral.strategy.impl.duck.MallardDuck;
import behavioral.strategy.impl.duck.ModelDuck;
import behavioral.strategy.model.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

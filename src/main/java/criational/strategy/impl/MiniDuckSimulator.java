package criational.strategy.impl;

import criational.strategy.impl.behaviors.FlyRocketPowered;
import criational.strategy.impl.duck.MallardDuck;
import criational.strategy.impl.duck.ModelDuck;
import criational.strategy.model.Duck;

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

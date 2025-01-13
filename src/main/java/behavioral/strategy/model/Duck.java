package behavioral.strategy.model;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public Duck() {

    }
    public abstract void display();
    public void performFly() {
        this.flyBehavior.fly();
    }
    public void performQuack() {
        this.quackBehavior.quack();
    }
    public void swin() {
        System.out.println("All ducks  float, even decoys!");
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}

package structural.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says: ");
        turkey.gobble();
        turkey.fly();

        System.out.println("The ducks says: ");
        testDuck(duck);

        System.out.println("The turkeyAdaper says: ");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

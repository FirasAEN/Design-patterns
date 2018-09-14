package Strategy;

import Strategy.DuckTypes.Duck;
import Strategy.DuckTypes.MallardDuck;
import Strategy.FlyBehavior.FlyNoWay;
import Strategy.FlyBehavior.FlyWithWings;
import Strategy.QuackBehavior.Quack;
import Strategy.QuackBehavior.Squeak;

public class Ducks {
    public static void main(String[] args){
        Duck d = new MallardDuck();
        d.setFlyBehavior(new FlyWithWings());
        d.setQuackBehavior(new Quack());

        d.performFly();
        d.performQuack();


        d.setFlyBehavior(new FlyNoWay());
        d.setQuackBehavior(new Squeak());
        d.performFly();
        d.performQuack();
    }
}

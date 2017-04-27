package strategy_pattern.DuckTypes;

import strategy_pattern.FlyBehavior.FlyBehavior;
import strategy_pattern.QuackBehavior.QuackBehavior;

/**
 * Created by FAB3659 on 4/27/2017.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swim(){

    }

    public void display(){

    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

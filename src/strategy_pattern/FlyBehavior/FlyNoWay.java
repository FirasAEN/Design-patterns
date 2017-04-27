package strategy_pattern.FlyBehavior;

/**
 * Created by FAB3659 on 4/27/2017.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly !");
    }
}

package strategy_pattern.QuackBehavior;

/**
 * Created by FAB3659 on 4/27/2017.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack !!!");
    }
}

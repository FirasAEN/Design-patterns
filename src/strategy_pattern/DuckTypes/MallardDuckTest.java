package strategy_pattern.DuckTypes;

import strategy_pattern.FlyBehavior.FlyWithWings;
import strategy_pattern.QuackBehavior.Quack;
import org.junit.Test;

/**
 * Created by FAB3659 on 4/27/2017.
 */
public class MallardDuckTest {

    @Test
    public void testCreateDuck(){
        Duck d = new MallardDuck();
        d.setFlyBehavior(new FlyWithWings());
        d.setQuackBehavior(new Quack());

        d.performFly();
        d.performQuack();
    }



}
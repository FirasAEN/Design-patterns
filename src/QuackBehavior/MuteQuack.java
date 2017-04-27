package QuackBehavior;

/**
 * Created by FAB3659 on 4/27/2017.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}

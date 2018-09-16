package State;

/**
 * Created by Firas on 9/15/2018.
 */
public class FanSwitcher {
    public static void main(String[] args){
        Fan fan = new Fan();
        fan.toggle(); // go to low state
        fan.toggle(); // go to medium state
        fan.toggle(); // go to high state
        fan.toggle(); // go back to off state
    }
}

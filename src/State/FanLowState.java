package State;

/**
 * Created by Firas on 9/15/2018.
 */
public class FanLowState implements FanState {
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("Fan is now in medium state");
        this.fan.setCurrentState(this.fan.getMediumState());
    }
}

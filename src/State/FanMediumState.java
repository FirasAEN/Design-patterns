package State;

/**
 * Created by Firas on 9/15/2018.
 */
public class FanMediumState implements FanState{
    private Fan fan;

    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("Fan is now in high state");
        this.fan.setCurrentState(this.fan.getHighState());
    }
}

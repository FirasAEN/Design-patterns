package State;

/**
 * Created by Firas on 9/15/2018.
 */
 public class FanHighState implements FanState{
    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("Fan is back to off state");
        this.fan.setCurrentState(this.fan.getOffState());
    }

}

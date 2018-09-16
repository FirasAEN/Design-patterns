package State;

/**
 * Created by Firas on 9/15/2018.
 */
public class FanOffState implements FanState{
    private Fan fan;

    public FanOffState(Fan fan){
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("Fan is now in low state");
        this.fan.setCurrentState(this.fan.getLowState());
    }
}

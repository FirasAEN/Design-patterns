package State;

/**
 * Created by Firas on 9/15/2018.
 */
public class Fan {

    private FanState fanOffState;
    private FanState fanLowState;
    private FanState fanMedState;
    private FanState fanHighState;
    private FanState currentState;


    public Fan(){
        this.fanOffState = new FanOffState(this);
        this.fanLowState = new FanLowState(this);
        this.fanMedState = new FanMediumState(this);
        this.fanHighState = new FanHighState(this);

        this.currentState = fanOffState;
        System.out.println("Fan is off");
    }

    public void setCurrentState(FanState state) {
        this.currentState = state;
    }

    public FanState getLowState() {
        return this.fanLowState;
    }

    public FanState getMediumState() {
        return this.fanMedState;
    }

    public FanState getHighState() {
        return this.fanHighState;
    }

    public FanState getOffState() {
        return this.fanOffState;
    }

    public FanState getCurrentState(){
        return this.currentState;
    }

    public void toggle(){
        this.currentState.handle();
    }
}

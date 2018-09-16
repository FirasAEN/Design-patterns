package Mediator;

/**
 * Created by Firas on 9/15/2018.
 */
public class Light {

    private String room;
    private boolean state;

    public Light(String roomName) {
        this.room = roomName;
    }

    public void toggle() {
        this.state =  !this.state;
    }

    public boolean isOn() {
        return state;
    }

    public String getRoom() {
        return this.room;
    }
}

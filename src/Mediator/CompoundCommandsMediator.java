package Mediator;


/**
 * Created by Firas on 12/13/2017.
 */
public class CompoundCommandsMediator {

    public static void main(String[] args){
        Light kitchen = new Light("Kitchen");
        Light livingRoom = new Light("living room");

        kitchen.toggle();

        LightConcreteMediator lightsMediator = new LightConcreteMediator();
        lightsMediator.addItem(kitchen);
        lightsMediator.addItem(livingRoom);

        Command toggleLightsCommand = new ToggleAllLightsCommand(lightsMediator);
        toggleLightsCommand.execute();

    }
}

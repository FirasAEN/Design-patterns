package Command.Receivers.ConcreteCommands;

import Command.CommandInterfaces.ExecuteCommand;
import Command.Receivers.Light;

/**
 * Created by Firas on 12/13/2017.
 */
public class LightOffCommand implements ExecuteCommand {

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}

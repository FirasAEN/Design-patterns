package Command.Receivers.ConcreteCommands;

import Command.CommandInterfaces.Command;
import Command.Receivers.Light;

/**
 * Created by Firas on 12/13/2017.
 */
public class LightOffCommand extends Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
        System.out.println("Undo : light turned on");
    }
}

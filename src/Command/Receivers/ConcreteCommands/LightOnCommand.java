package Command.Receivers.ConcreteCommands;

import Command.CommandInterfaces.Command;
import Command.Receivers.Light;

/**
 * Created by Firas on 12/13/2017.
 */
public class LightOnCommand extends Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
        System.out.println("Undo : light turned off");
    }
}

package Command;

import Command.CommandInterfaces.ExecuteCommand;
import Command.Invokers.RemoteController;
import Command.Receivers.ConcreteCommands.LightOffCommand;
import Command.Receivers.ConcreteCommands.LightOnCommand;
import Command.Receivers.Light;

import java.util.Arrays;

/**
 * Created by Firas on 12/13/2017.
 */
public class CommandPattern {

    public static void main(String[] args){
        Light light = new Light("Living room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        Arrays.asList(remoteController.getOnCommands())
                .forEach(ExecuteCommand::execute);
        Arrays.asList(remoteController.getOffCommands())
                .forEach(ExecuteCommand::execute);

        System.out.println(remoteController);
    }
}

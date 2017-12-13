package Command;

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

        Arrays.asList(remoteController.getOnCommand())
                .forEach(Command::execute);
        Arrays.asList(remoteController.getOffCommand())
                .forEach(Command::execute);

        System.out.println(remoteController);
    }
}

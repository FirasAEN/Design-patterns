package Command.Invokers;

import Command.CommandInterfaces.ExecuteCommand;

/**
 * Created by Firas on 12/13/2017.
 */
public class RemoteController {

    ExecuteCommand[] onExecuteCommands;
    ExecuteCommand[] offExecuteCommands;

    public RemoteController(){
        onExecuteCommands = new ExecuteCommand[1];
        offExecuteCommands = new ExecuteCommand[1];
    }
    public void setCommand(int slot, ExecuteCommand onExecuteCommand, ExecuteCommand offExecuteCommand){
        this.onExecuteCommands[slot] = onExecuteCommand;
        this.offExecuteCommands[slot] = offExecuteCommand;
    }

    public void onCommandPushed(int slot){
        onExecuteCommands[slot].execute();
    }

    public void offCommandPushed(int slot){
        offExecuteCommands[slot].execute();
    }

    public ExecuteCommand[] getOnCommands(){
        return this.onExecuteCommands;
    }

    public ExecuteCommand[] getOffCommands(){
        return this.offExecuteCommands;
    }

    @Override
    public String toString() {
        StringBuilder remoteController = new StringBuilder();
        remoteController.append("\n------ Remote Controller ------\n");

        for (int slot = 0; slot< onExecuteCommands.length; slot++){
            remoteController.append(onExecuteCommands[slot].getClass().getName());
            remoteController.append("     ");
            remoteController.append(offExecuteCommands[slot].getClass().getName());
            remoteController.append("\n");
        }

        return remoteController.toString();
    }
}

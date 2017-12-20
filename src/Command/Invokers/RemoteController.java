package Command.Invokers;

import Command.CommandInterfaces.Command;

/**
 * Created by Firas on 12/13/2017.
 */
public class RemoteController {

    private Command[] onExecuteCommands;
    private Command[] offExecuteCommands;
    private Command lastExecutedCommand;

    public RemoteController(){
        onExecuteCommands = new Command[1];
        offExecuteCommands = new Command[1];
    }
    public void setCommand(int slot, Command onExecuteCommand, Command offExecuteCommand){
        this.onExecuteCommands[slot] = onExecuteCommand;
        this.offExecuteCommands[slot] = offExecuteCommand;
    }

    public void onCommandPushed(int slot){
        lastExecutedCommand = onExecuteCommands[slot];
        onExecuteCommands[slot].execute();
    }

    public void offCommandPushed(int slot){
        lastExecutedCommand = offExecuteCommands[slot];
        offExecuteCommands[slot].execute();
    }

    public Command[] getOnCommands(){
        return this.onExecuteCommands;
    }

    public Command[] getOffCommands(){
        return this.offExecuteCommands;
    }

    public void undo(){
        lastExecutedCommand.undo();
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
            remoteController.append(lastExecutedCommand.getClass().getName());
            remoteController.append("\n");
        }

        return remoteController.toString();
    }
}

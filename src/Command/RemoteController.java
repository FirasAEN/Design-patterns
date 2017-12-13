package Command;

/**
 * Created by Firas on 12/13/2017.
 */
public class RemoteController {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteController(){
        onCommands = new Command[1];
        offCommands = new Command[1];
    }
    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onCommandPushed(int slot){
        onCommands[slot].execute();
    }

    public void offCommandPushed(int slot){
        offCommands[slot].execute();
    }

    public Command[] getOnCommand(){
        return this.onCommands;
    }

    public Command[] getOffCommand(){
        return this.offCommands;
    }

    @Override
    public String toString() {
        StringBuilder remotecontroller = new StringBuilder();
        remotecontroller.append("\n------ Remote Controller ------\n");

        for (int slot = 0; slot< onCommands.length; slot++){
            remotecontroller.append(onCommands[slot].getClass().getName());
            remotecontroller.append("     ");
            remotecontroller.append(offCommands[slot].getClass().getName());
            remotecontroller.append("\n");
        }

        return remotecontroller.toString();
    }
}

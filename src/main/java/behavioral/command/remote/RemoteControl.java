package behavioral.command.remote;

import behavioral.command.remote.Command;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;


    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        undoCommand = noCommand;
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        this.undoCommand = onCommands[slot];
    }

    public void offCommandWasPushed(int slot) {
        offCommands[slot].execute();
        this.undoCommand = onCommands[slot];
    }

    public void undoButtonWassPressed() {
        this.undoCommand.undo();
    }

    public String toString() {
        StringBuffer stb = new StringBuffer();
        stb.append("\n------ Remote Control ------\n");
        for(int i = 0; i < onCommands.length; i++) {
            stb.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }

        stb.append("\n UNDO button" + undoCommand.getClass().getName());
        return stb.toString();
    }
}

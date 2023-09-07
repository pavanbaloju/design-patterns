package com.learning.designpatterns.command.remotecontrol.invoker;

import com.learning.designpatterns.command.remotecontrol.command.concretecommands.NoCommand;
import com.learning.designpatterns.command.remotecontrol.command.Command;

public class Remote {

    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;

    public Remote() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        NoCommand noCommand = new NoCommand();

        for (int i = 0; i < 5; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pressUndoButton() {
        undoCommand.undo();
    }
}

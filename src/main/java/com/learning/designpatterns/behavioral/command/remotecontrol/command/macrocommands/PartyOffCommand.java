package com.learning.designpatterns.behavioral.command.remotecontrol.command.macrocommands;

import com.learning.designpatterns.behavioral.command.remotecontrol.command.Command;

public class PartyOffCommand implements Command {

    private Command[] commands;

    public PartyOffCommand(Command... commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}

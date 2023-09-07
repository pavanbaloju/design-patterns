package com.learning.designpatterns.command.remotecontrol.command.concretecommands;

import com.learning.designpatterns.command.remotecontrol.command.Command;
import com.learning.designpatterns.command.remotecontrol.receiver.MusicPlayer;

public class StopMusicCommand implements Command {

    private final MusicPlayer musicPlayer;

    public StopMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.stopSongs();
    }

    @Override
    public void undo() {
        musicPlayer.on();
        musicPlayer.playSongs();
    }
}

package com.learning.designpatterns.command.remotecontrol.command.concretecommands;

import com.learning.designpatterns.command.remotecontrol.command.Command;
import com.learning.designpatterns.command.remotecontrol.receiver.MusicPlayer;

public class PlayMusicCommand implements Command {

    private final MusicPlayer musicPlayer;

    public PlayMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.on();
        musicPlayer.playSongs();
    }

    @Override
    public void undo() {
        musicPlayer.stopSongs();
    }
}

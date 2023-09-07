package com.learning.designpatterns.command.remotecontrol.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MusicPlayer {

    private final Logger logger = LoggerFactory.getLogger(MusicPlayer.class);

    public void on(){
        logger.info("Music player turned on!");
    }

    public void playSongs(){
        logger.info("Now playing top 10 songs!");
    }

    public void stopSongs() {
        logger.info("Stopped songs and music player turned off!");
    }
}

package com.learning.designpatterns.structural.facade.hometheater.subsystem;

// Subsystem class for DVD Player
public class DvdPlayer {
    public void on() {
        System.out.println("DVD Player is on");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("DVD Player stopped");
    }

    public void off() {
        System.out.println("DVD Player is off");
    }
}


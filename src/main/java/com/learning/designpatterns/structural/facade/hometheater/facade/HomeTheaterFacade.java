package com.learning.designpatterns.structural.facade.hometheater.facade;

import com.learning.designpatterns.structural.facade.hometheater.subsystem.DvdPlayer;
import com.learning.designpatterns.structural.facade.hometheater.subsystem.Projector;
import com.learning.designpatterns.structural.facade.hometheater.subsystem.SoundSystem;
import com.learning.designpatterns.structural.facade.hometheater.subsystem.TheaterLights;

public class HomeTheaterFacade {
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final SoundSystem soundSystem;
    private final TheaterLights theaterLights;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, TheaterLights theaterLights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.theaterLights = theaterLights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        theaterLights.dim(10); // Dim the lights
        projector.on();
        projector.setInput("DVD Player");
        projector.wideScreenMode(); // Set the projector to widescreen mode
        soundSystem.on();
        soundSystem.setVolume(5); // Set the volume
        dvdPlayer.on();
        dvdPlayer.play(movie); // Play the movie
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.stop();
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
        theaterLights.dim(100); // Bring the lights back to full brightness
    }
}

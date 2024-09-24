package com.learning.designpatterns.structural.facade.hometheater.client;

import com.learning.designpatterns.structural.facade.hometheater.facade.HomeTheaterFacade;
import com.learning.designpatterns.structural.facade.hometheater.subsystem.DvdPlayer;
import com.learning.designpatterns.structural.facade.hometheater.subsystem.Projector;
import com.learning.designpatterns.structural.facade.hometheater.subsystem.SoundSystem;
import com.learning.designpatterns.structural.facade.hometheater.subsystem.TheaterLights;

public class FacadePatternDemo {
    public static void main(String[] args) {
        // Create subsystem components
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        TheaterLights theaterLights = new TheaterLights();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, theaterLights);

        // Watch a movie
        homeTheater.watchMovie("Inception");

        // End the movie
        homeTheater.endMovie();
    }
}

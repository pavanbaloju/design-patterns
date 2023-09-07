package com.learning.designpatterns.command.remotecontrol.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Light {

    private final String name;

    private final Logger logger = LoggerFactory.getLogger(Light.class);

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        logger.info("{} is turned on", name);
    }

    public void off() {
        logger.info("{} is turned off", name);
    }
}

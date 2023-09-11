package com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies;

import com.learning.designpatterns.strategy.cricketteam.strategy.Batsman;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WickerKeeper implements Batsman {

    private final Logger logger = LoggerFactory.getLogger(WickerKeeper.class);

    @Override
    public void bat() {
        logger.info("I am a wicket keeper batsman");
    }
}

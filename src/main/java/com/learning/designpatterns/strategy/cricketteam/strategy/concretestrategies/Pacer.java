package com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies;

import com.learning.designpatterns.strategy.cricketteam.strategy.BowlingBehaviour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pacer implements BowlingBehaviour {

    private final Logger logger = LoggerFactory.getLogger(Pacer.class);

    @Override
    public void bowl() {
        logger.info("I am a pace bowler");
    }
}

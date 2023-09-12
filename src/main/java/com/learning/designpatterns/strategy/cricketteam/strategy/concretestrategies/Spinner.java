package com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies;

import com.learning.designpatterns.strategy.cricketteam.strategy.BowlingBehaviour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spinner implements BowlingBehaviour {

    private final Logger logger = LoggerFactory.getLogger(Spinner.class);

    @Override
    public void bowl() {
        logger.info("I am spin bowler");
    }
}

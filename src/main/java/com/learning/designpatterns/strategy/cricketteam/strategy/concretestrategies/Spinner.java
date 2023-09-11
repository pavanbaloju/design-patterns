package com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies;

import com.learning.designpatterns.strategy.cricketteam.strategy.Bowler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spinner implements Bowler {

    private final Logger logger = LoggerFactory.getLogger(Spinner.class);

    @Override
    public void bowl() {
        logger.info("I bowl spin");
    }
}

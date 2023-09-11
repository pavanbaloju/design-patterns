package com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies;

import com.learning.designpatterns.strategy.cricketteam.strategy.Batsman;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiddleOrderBatsman implements Batsman {
    private final Logger logger = LoggerFactory.getLogger(MiddleOrderBatsman.class);

    @Override
    public void bat() {
        logger.info("I bat in the middle order");
    }
}

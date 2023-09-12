package com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies;

import com.learning.designpatterns.strategy.cricketteam.strategy.BattingBehaviour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiddleOrderBattingBehaviour implements BattingBehaviour {
    private final Logger logger = LoggerFactory.getLogger(MiddleOrderBattingBehaviour.class);

    @Override
    public void bat() {
        logger.info("I bat in the middle order");
    }
}

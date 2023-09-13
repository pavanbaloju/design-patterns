package com.learning.designpatterns.strategy.cricket.strategy.concretestrategies;

import com.learning.designpatterns.strategy.cricket.strategy.BowlingSkill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PartTimeBowlingSkill implements BowlingSkill {

    private final Logger logger = LoggerFactory.getLogger(PartTimeBowlingSkill.class);

    @Override
    public void bowl() {
        logger.info("bowling a few overs when required");
    }
}

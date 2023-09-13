package com.learning.designpatterns.strategy.cricket.strategy.concretestrategies;

import com.learning.designpatterns.strategy.cricket.strategy.BowlingSkill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpinBowlingSkill implements BowlingSkill {

    private final Logger logger = LoggerFactory.getLogger(SpinBowlingSkill.class);

    @Override
    public void bowl() {
        logger.info("bowling spin");
    }
}

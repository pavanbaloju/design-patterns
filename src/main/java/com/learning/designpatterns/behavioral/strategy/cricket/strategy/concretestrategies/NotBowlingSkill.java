package com.learning.designpatterns.behavioral.strategy.cricket.strategy.concretestrategies;

import com.learning.designpatterns.behavioral.strategy.cricket.strategy.BowlingSkill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotBowlingSkill implements BowlingSkill {
    private final Logger logger = LoggerFactory.getLogger(NotBowlingSkill.class);

    @Override
    public void bowl() {
        logger.info("cannot bowl");
    }
}

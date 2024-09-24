package com.learning.designpatterns.behavioral.strategy.cricket.strategy.concretestrategies;

import com.learning.designpatterns.behavioral.strategy.cricket.strategy.BattingSkill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenerBattingSkill implements BattingSkill {

    private final Logger logger = LoggerFactory.getLogger(OpenerBattingSkill.class);

    @Override
    public void bat() {
        logger.info("opening the batting innings");
    }
}

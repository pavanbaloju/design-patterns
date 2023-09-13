package com.learning.designpatterns.strategy.cricket.strategy.concretestrategies;

import com.learning.designpatterns.strategy.cricket.strategy.BattingSkill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TailEnderBattingSkill implements BattingSkill {

    private final Logger logger = LoggerFactory.getLogger(TailEnderBattingSkill.class);

    @Override
    public void bat() {
        logger.info("can't bat, but batting because I have to");
    }
}

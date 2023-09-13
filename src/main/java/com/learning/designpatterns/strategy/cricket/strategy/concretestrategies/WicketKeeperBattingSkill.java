package com.learning.designpatterns.strategy.cricket.strategy.concretestrategies;

import com.learning.designpatterns.strategy.cricket.strategy.BattingSkill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WicketKeeperBattingSkill implements BattingSkill {

    private final Logger logger = LoggerFactory.getLogger(WicketKeeperBattingSkill.class);

    @Override
    public void bat() {
        logger.info("keeping wickets and batting in lower order");
    }
}

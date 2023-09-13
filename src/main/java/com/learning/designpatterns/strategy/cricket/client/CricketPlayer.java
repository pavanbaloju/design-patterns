package com.learning.designpatterns.strategy.cricket.client;

import com.learning.designpatterns.strategy.cricket.strategy.BattingSkill;
import com.learning.designpatterns.strategy.cricket.strategy.BowlingSkill;
import com.learning.designpatterns.strategy.cricket.strategy.concretestrategies.MiddleOrderBattingSkill;
import com.learning.designpatterns.strategy.cricket.strategy.concretestrategies.NotBowlingSkill;
import com.learning.designpatterns.strategy.cricket.strategy.concretestrategies.OpenerBattingSkill;
import com.learning.designpatterns.strategy.cricket.strategy.concretestrategies.PaceBowlingSkill;
import com.learning.designpatterns.strategy.cricket.strategy.concretestrategies.SpinBowlingSkill;
import com.learning.designpatterns.strategy.cricket.strategy.concretestrategies.TailEnderBattingSkill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CricketPlayer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private BattingSkill battingSkill;
    private BowlingSkill bowlingSkill;

    public static void main(String[] args) {
        CricketPlayer openerBatsman = new CricketPlayer();
        openerBatsman.setBattingSkill(new OpenerBattingSkill());
        openerBatsman.setBowlingSkill(new NotBowlingSkill());
        openerBatsman.bat();
        openerBatsman.bowl();
        openerBatsman.field();

        CricketPlayer paceBowler = new CricketPlayer();
        paceBowler.setBowlingSkill(new PaceBowlingSkill());
        paceBowler.setBattingSkill(new TailEnderBattingSkill());
        paceBowler.bat();
        paceBowler.bowl();

        CricketPlayer allRounder = new CricketPlayer();
        allRounder.setBattingSkill(new MiddleOrderBattingSkill());
        allRounder.setBowlingSkill(new SpinBowlingSkill());
        allRounder.bat();
        allRounder.bowl();
        allRounder.field();
    }

    public void bat() {
        battingSkill.bat();
    }

    public void bowl() {
        bowlingSkill.bowl();
    }

    public void field() {
        logger.info("fielding...");
    }

    public void setBattingSkill(BattingSkill battingSkill) {
        this.battingSkill = battingSkill;
    }

    public void setBowlingSkill(BowlingSkill bowlingSkill) {
        this.bowlingSkill = bowlingSkill;
    }
}

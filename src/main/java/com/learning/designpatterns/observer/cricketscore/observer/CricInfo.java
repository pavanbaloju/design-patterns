package com.learning.designpatterns.observer.cricketscore.observer;

import com.learning.designpatterns.observer.cricketscore.model.Score;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CricInfo implements Observer {

    private final Logger logger = LoggerFactory.getLogger(CricInfo.class);
    private Score score;

    @Override
    public void update(Score score) {
        this.score = score;
        display();
    }

    @Override
    public void display() {
        logger.info("Hello there, Cricinfo users! The score stands at {}-{} after {} overs", score.getRuns(), score.getWickets(), score.getOvers());
    }
}

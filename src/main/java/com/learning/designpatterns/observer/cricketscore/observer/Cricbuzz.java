package com.learning.designpatterns.observer.cricketscore.observer;

import com.learning.designpatterns.observer.cricketscore.model.Score;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cricbuzz implements Observer {

    private final Logger logger = LoggerFactory.getLogger(Cricbuzz.class);
    private Score score;

    @Override
    public void update(Score score) {
        this.score = score;
        display();
    }

    @Override
    public void display() {
        logger.info("Hi Cricbuzz users, the score is {}-{} after {} overs", score.getRuns(), score.getWickets(), score.getOvers());
    }
}

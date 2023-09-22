package com.learning.designpatterns.observer.cricketscore.subject;

import com.learning.designpatterns.observer.cricketscore.model.Score;

public class CricketData extends SubjectImpl {

    private Score score;

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
        notifyObservers(score);
    }
}

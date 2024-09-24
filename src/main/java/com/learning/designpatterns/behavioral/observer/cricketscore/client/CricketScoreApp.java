package com.learning.designpatterns.behavioral.observer.cricketscore.client;

import com.learning.designpatterns.behavioral.observer.cricketscore.observer.CricInfo;
import com.learning.designpatterns.behavioral.observer.cricketscore.observer.Cricbuzz;
import com.learning.designpatterns.behavioral.observer.cricketscore.observer.Observer;
import com.learning.designpatterns.behavioral.observer.cricketscore.subject.CricketData;
import com.learning.designpatterns.behavioral.observer.cricketscore.model.Score;

public class CricketScoreApp {

    public static void main(String[] args) {

        Observer cricbuzz = new Cricbuzz();
        Observer cricInfo = new CricInfo();

        CricketData cricketData = new CricketData();
        cricketData.addObserver(cricbuzz);
        cricketData.addObserver(cricInfo);

        cricketData.setScore(new Score(10, 0, 1.0));
        cricketData.setScore(new Score(25, 1, 2.0));
        cricketData.setScore(new Score(50, 1, 3.0));

        cricketData.removeObserver(cricInfo);

        cricketData.setScore(new Score(55, 1, 3.3));

    }
}

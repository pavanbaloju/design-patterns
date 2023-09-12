package com.learning.designpatterns.strategy.cricketteam.client;

import com.learning.designpatterns.strategy.cricketteam.strategy.BattingBehaviour;
import com.learning.designpatterns.strategy.cricketteam.strategy.BowlingBehaviour;
import com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies.Opener;
import com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies.Spinner;

public class CricketPlayer {

    private BattingBehaviour battingBehaviour;
    private BowlingBehaviour bowlingBehaviour;

    public void setBattingBehaviour(BattingBehaviour battingBehaviour) {
        this.battingBehaviour = battingBehaviour;
    }

    public void setBowlingBehaviour(BowlingBehaviour bowlingBehaviour) {
        this.bowlingBehaviour = bowlingBehaviour;
    }

    public void play() {
        battingBehaviour.bat();
        bowlingBehaviour.bowl();
    }

    public static void main(String[] args) {
        CricketPlayer cricketPlayer = new CricketPlayer();
        cricketPlayer.setBattingBehaviour(new Opener());
        cricketPlayer.setBowlingBehaviour(new Spinner());

        cricketPlayer.play();
    }
}

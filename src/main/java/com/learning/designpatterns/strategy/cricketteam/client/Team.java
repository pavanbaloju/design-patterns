package com.learning.designpatterns.strategy.cricketteam.client;

import com.learning.designpatterns.strategy.cricketteam.strategy.Batsman;
import com.learning.designpatterns.strategy.cricketteam.strategy.Bowler;
import com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies.MiddleOrderBatsman;
import com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies.Opener;
import com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies.Pacer;
import com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies.Spinner;
import com.learning.designpatterns.strategy.cricketteam.strategy.concretestrategies.WickerKeeper;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private final List<Batsman> batsmen;
    private final List<Bowler> bowlers;

    public Team() {
        batsmen = new ArrayList<>(7);
        bowlers = new ArrayList<>(4);
    }

    public void addBatsman(Batsman batsman) {
        batsmen.add(batsman);
    }

    public void addBowler(Bowler bowler) {
        bowlers.add(bowler);
    }

    public void introduceTeam() {
        batsmen.forEach(Batsman::bat);
        bowlers.forEach(Bowler::bowl);
    }

    public static void main(String[] args) {
        Team team = new Team();
        team.addBatsman(new Opener());
        team.addBatsman(new Opener());
        team.addBatsman(new MiddleOrderBatsman());
        team.addBatsman(new MiddleOrderBatsman());
        team.addBatsman(new MiddleOrderBatsman());
        team.addBatsman(new WickerKeeper());
        team.addBowler(new Pacer());
        team.addBowler(new Pacer());
        team.addBowler(new Pacer());
        team.addBowler(new Spinner());
        team.addBowler(new Spinner());

        team.introduceTeam();
    }
}

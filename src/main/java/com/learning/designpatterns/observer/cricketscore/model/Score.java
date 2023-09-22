package com.learning.designpatterns.observer.cricketscore.model;

public class Score {

    private final int runs;
    private final int wickets;
    private final double overs;

    public Score(int runs, int wickets, double overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public double getOvers() {
        return overs;
    }
}

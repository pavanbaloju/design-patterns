package com.learning.designpatterns.behavioral.observer.cricketscore.subject;

import com.learning.designpatterns.behavioral.observer.cricketscore.model.Score;
import com.learning.designpatterns.behavioral.observer.cricketscore.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectImpl implements Subject {

    protected final List<Observer> observers;

    protected SubjectImpl() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Score score) {
        observers.forEach(observer -> observer.update(score));
    }
}

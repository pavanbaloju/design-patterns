package com.learning.designpatterns.behavioral.observer.cricketscore.subject;

import com.learning.designpatterns.behavioral.observer.cricketscore.model.Score;
import com.learning.designpatterns.behavioral.observer.cricketscore.observer.Observer;

public interface Subject {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers(Score score);
}

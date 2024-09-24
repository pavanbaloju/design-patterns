package com.learning.designpatterns.behavioral.observer.cricketscore.observer;

import com.learning.designpatterns.behavioral.observer.cricketscore.model.Score;

public interface Observer {

    void update(Score score);

    void display();
}

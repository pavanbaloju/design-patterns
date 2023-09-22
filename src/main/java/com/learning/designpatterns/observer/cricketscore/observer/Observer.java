package com.learning.designpatterns.observer.cricketscore.observer;

import com.learning.designpatterns.observer.cricketscore.model.Score;

public interface Observer {

    void update(Score score);

    void display();
}

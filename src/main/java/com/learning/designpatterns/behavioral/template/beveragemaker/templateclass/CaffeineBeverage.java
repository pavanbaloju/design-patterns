package com.learning.designpatterns.behavioral.template.beveragemaker.templateclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CaffeineBeverage {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantCondiments()) {
            addCondiments();
        }
    }

    protected boolean wantCondiments() {
        return false;
    }

    private void boilWater() {
        logger.info("boiling water");
    }

    protected abstract void brew();

    private void pourInCup() {
        logger.info("pouring in cup");
    }

    protected abstract void addCondiments();
}

package com.learning.designpatterns.template.beveragemaker.concreteclasses;

import com.learning.designpatterns.template.beveragemaker.templateclass.CaffeineBeverage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Coffee extends CaffeineBeverage {

    private final Logger logger = LoggerFactory.getLogger(Coffee.class);

    @Override
    protected void brew() {
        logger.info("dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        logger.info("adding sugar and milk");
    }

    @Override
    protected boolean wantCondiments() {
        return true;
    }
}

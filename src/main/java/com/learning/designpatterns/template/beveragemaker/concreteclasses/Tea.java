package com.learning.designpatterns.template.beveragemaker.concreteclasses;

import com.learning.designpatterns.template.beveragemaker.templateclass.CaffeineBeverage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tea extends CaffeineBeverage {

    private final Logger logger = LoggerFactory.getLogger(Tea.class);

    @Override
    protected void brew() {
        logger.info("steeping the tea");
    }

    @Override
    protected void addCondiments() {
        logger.info("adding ginger");
    }
}

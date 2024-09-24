package com.learning.designpatterns.behavioral.command.restaurant.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Order {

    private final String name;
    private final Logger logger = LoggerFactory.getLogger(Order.class);

    public Order(String name) {
        this.name = name;
    }

    public void placeOrder() {
        logger.info("{} order is placed", name);
    }
    public void prepare() {
        logger.info("{} is prepared", name);
    }

    public void serve() {
        logger.info("{} is served", name);
    }
}

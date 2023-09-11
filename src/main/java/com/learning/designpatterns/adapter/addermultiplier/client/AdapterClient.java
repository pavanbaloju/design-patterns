package com.learning.designpatterns.adapter.addermultiplier.client;

import com.learning.designpatterns.adapter.addermultiplier.adaptee.AdderImpl;
import com.learning.designpatterns.adapter.addermultiplier.adapterinterface.AdderAdapterImpl;
import com.learning.designpatterns.adapter.addermultiplier.clientinterface.Multiplier;
import com.learning.designpatterns.adapter.addermultiplier.clientinterface.MultiplierImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdapterClient {

    private static final Logger logger = LoggerFactory.getLogger(AdapterClient.class);

    public static void main(String[] args) {

        Multiplier multiplier = new MultiplierImpl();
        Multiplier adderAdapter = new AdderAdapterImpl(new AdderImpl());

        logger.info("Multiplier: {}}", multiplier.multiply(10,5));
        logger.info("AdderAdapter: {}}", adderAdapter.multiply(10,5));
    }
}

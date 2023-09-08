package com.learning.designpatterns.adapter.client;

import com.learning.designpatterns.adapter.adaptee.AdderImpl;
import com.learning.designpatterns.adapter.adapterinterface.AdderAdapterImpl;
import com.learning.designpatterns.adapter.clientinterface.Multiplier;
import com.learning.designpatterns.adapter.clientinterface.MultiplierImpl;
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

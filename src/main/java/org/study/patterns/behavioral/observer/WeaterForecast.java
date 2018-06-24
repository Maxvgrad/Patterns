package org.study.patterns.behavioral.observer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.utils.Utils;

import java.time.LocalTime;

public class WeaterForecast extends ObserverSkeleton implements Observer {
private static final Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());

    public WeaterForecast(Subject weatherStation) {
        super(weatherStation);
    }

    @Override
    protected void render() {
        LOGGER.info("Time: {} Temperature: {}", LocalTime.now(), getTemperature());
    }
}


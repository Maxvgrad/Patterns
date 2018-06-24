package org.study.patterns.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.utils.Utils;

import java.time.LocalTime;

public class WeatherWidget extends ObserverSkeleton implements Observer {
    private static Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());

    public WeatherWidget(Subject weatherStation) {
        super(weatherStation);
    }

    public void render() {
        LOGGER.info("Time: {} Temperature: {}", LocalTime.now(), getTemperature());
    }
}

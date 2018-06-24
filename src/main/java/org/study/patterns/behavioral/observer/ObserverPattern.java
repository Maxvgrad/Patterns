package org.study.patterns.behavioral.observer;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.study.patterns.Pattern;
import org.study.utils.Utils;

public class ObserverPattern implements Pattern {
    private static final Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());
    @Override
    public void execute() {
        Subject wSt = new WeatherStation();
        new WeatherWidget(wSt);
        new WeaterForecast(wSt);

        for(int i = 0; i < 100; i++) {
            var t = (int)(Math.random() * i);
            LOGGER.warn("{}: Temperature changed: {}", wSt.getClass().getSimpleName(), t);
            wSt.setState(t);
        }
    }
}

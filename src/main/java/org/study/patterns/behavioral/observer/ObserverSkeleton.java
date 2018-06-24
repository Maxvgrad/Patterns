package org.study.patterns.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.utils.Utils;

public abstract class ObserverSkeleton implements Observer {
    private static Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());
    private Subject weatherStation;
    private int temperature;

    public ObserverSkeleton (Subject weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.subscribe(this);
    }

    @Override
    public void update() {
        temperature = weatherStation.getState();
        render();
    }

    protected abstract void render();

    protected int getTemperature() {
        return temperature;
    }
}

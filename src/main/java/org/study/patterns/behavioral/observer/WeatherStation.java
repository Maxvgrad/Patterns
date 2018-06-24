package org.study.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private final List<Observer> subscribers = new ArrayList<>();
    private int temperature;

    @Override
    public boolean subscribe(Observer o) {
        return subscribers.add(o);
    }

    @Override
    public boolean unsubscribe(Observer o) {
        return subscribers.remove(o);
    }

    @Override
    public void setState(int temperature) {
        this.temperature = temperature;
        subscribers.forEach(Observer::update);
    }

    @Override
    public int getState() {
        return temperature;
    }
}

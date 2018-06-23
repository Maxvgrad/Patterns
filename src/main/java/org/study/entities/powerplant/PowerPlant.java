package org.study.entities.powerplant;

import org.study.entities.person.Person;

import java.util.List;

public abstract class PowerPlant implements Powerable {
    protected List<Person> personal;
    private String name;

    public PowerPlant(String name) {
        this.name = name;
    }

    protected abstract void startPlant();
    protected abstract void shutDownPlant();
    protected abstract void maintainPlant();

    @Override
    public String toString() {
        return "PowerPlant{" +
                "name='" + name + '\'' +
                '}';
    }
}

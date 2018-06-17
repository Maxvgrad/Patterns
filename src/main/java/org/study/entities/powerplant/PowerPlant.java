package org.study.entities.powerplant;

import org.study.entities.person.Person;

import java.util.List;

abstract class PowerPlant implements Powerable {
    protected List<Person> personal;

    protected abstract void startPlant();
    protected abstract void shutDownPlant();
    protected abstract void maintainPlant();

}

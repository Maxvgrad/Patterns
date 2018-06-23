package org.study.patterns.behavioral.command;

import org.study.entities.databases.OracleDatabase;
import org.study.entities.developers.JavaDeveloper;
import org.study.entities.powerplant.PowerPlant;
import org.study.patterns.Pattern;
import org.study.patterns.creational.factorymethod.JavaDeveloperFactory;

public class CommandPattern implements Pattern {
    @Override
    public void execute() {
        JavaDeveloper dev = (JavaDeveloper) new JavaDeveloperFactory().createDeveloper(
                new OracleDatabase<PowerPlant>());
        dev.select(11L);
        dev.add(new Object());
        dev.remove(2L);
    }
}

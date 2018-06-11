package org.study.patterns.creational.factorymethod;

import org.study.entities.developers.Developer;
import org.study.patterns.Pattern;
import org.study.utils.ProgrammingLanguage;
import static org.study.utils.ProgrammingLanguage.*;

public class FactoryMethodPattern implements Pattern {

    public void execute() {
        DeveloperFactory developerFactory = createDeveloperFactory(JAVA);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    public static DeveloperFactory createDeveloperFactory (ProgrammingLanguage pl) {
        switch(pl) {
            case JAVA: return new JavaDeveloperFactory();
            case CPP: return new CppDeveloperFactory();
            default: throw new IllegalArgumentException("Prgramming language " +
                    pl.toString() + " is not found.");
        }
    }
}

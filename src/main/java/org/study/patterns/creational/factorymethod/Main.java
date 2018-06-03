package org.study.patterns.creational.factorymethod;

import org.study.utils.ProgrammingLanguage;
import static org.study.utils.ProgrammingLanguage.*;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory(JAVA);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactory (ProgrammingLanguage pl) {
        switch(pl) {
            case JAVA: return new JavaDeveloperFactory();
            case CPP: return new CppDeveloperFactory();
            default: throw new IllegalArgumentException("Prgramming language " +
                    pl.toString() + " is not found.");
        }
    }
}

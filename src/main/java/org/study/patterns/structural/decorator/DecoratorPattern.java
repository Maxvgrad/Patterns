package org.study.patterns.structural.decorator;

import org.study.entities.developers.Developer;
import org.study.patterns.Pattern;
import org.study.patterns.creational.factorymethod.FactoryMethodPattern;
import static org.study.utils.ProgrammingLanguage.*;

public class DecoratorPattern implements Pattern{
    @Override
    public void execute() {
        Developer javaDev = FactoryMethodPattern.createDeveloperFactory(JAVA).createDeveloper();
        Developer seniourDeveloper = new SeniourDeveloper(javaDev);
        seniourDeveloper.writeCode();
        Developer teamLeadDev = new TeamLeadDeveloper(new SeniourDeveloper(javaDev));
        teamLeadDev.writeCode();
    }
}

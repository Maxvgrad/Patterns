package org.study.patterns.structural.facade;

import org.study.entities.developers.Developer;
import org.study.entities.trackers.BugTracker;
import org.study.patterns.Pattern;
import org.study.patterns.creational.factorymethod.FactoryMethodPattern;
import static org.study.utils.ProgrammingLanguage.*;

public class FacadePattern implements Pattern {
    @Override
    public void execute() {
        //Factory pattern
        Developer dev = FactoryMethodPattern
                            .createDeveloperFactory(JAVA)
                            .createDeveloper();
        //Facade pattern
        WorkFlow wf = new WorkFlow(new Job(), dev, new BugTracker());
        wf.startDevelopment();
        wf.pauseDevelopment();
    }
}

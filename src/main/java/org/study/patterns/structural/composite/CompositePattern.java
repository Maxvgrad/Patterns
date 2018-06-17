package org.study.patterns.structural.composite;

import org.study.entities.developers.CppDeveloper;
import org.study.entities.developers.Developer;
import org.study.entities.developers.JavaDeveloper;
import org.study.entities.team.Team;
import org.study.entities.testers.ManualTester;
import org.study.entities.testers.QATester;
import org.study.entities.testers.Tester;
import org.study.patterns.Pattern;

public class CompositePattern implements Pattern{
    @Override
    public void execute() {
        Team<Developer, Tester> team = new Team<>();
        team.addDevMember(new JavaDeveloper());
        team.addDevMember(new CppDeveloper());
        team.addTestMember(new QATester());
        team.addTestMember(new ManualTester());
        team.createProgramm();
    }
}

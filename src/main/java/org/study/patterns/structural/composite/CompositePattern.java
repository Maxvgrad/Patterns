package org.study.patterns.structural.composite;

import org.study.entities.developers.CppDeveloper;
import org.study.entities.developers.Developer;
import org.study.entities.developers.JavaDeveloper;
import org.study.entities.team.Team;
import org.study.patterns.Pattern;

public class CompositePattern implements Pattern{
    @Override
    public void execute() {
        Team<Developer> team = new Team<>();
        team.addTeamMember(new JavaDeveloper());
        team.addTeamMember(new CppDeveloper());
        team.createProgramm();
    }
}

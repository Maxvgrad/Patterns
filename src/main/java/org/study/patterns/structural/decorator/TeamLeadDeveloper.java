package org.study.patterns.structural.decorator;

import org.study.entities.developers.Developer;

public class TeamLeadDeveloper implements Developer {
    private Developer developer;

    public TeamLeadDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void writeCode() {
        developer.writeCode();
        System.out.println("Interviewing java developers...");
    }
}

package org.study.patterns.structural.decorator;

import org.study.entities.developers.Developer;

public class SeniourDeveloper implements Developer{
    private Developer developer;

    public SeniourDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void writeCode() {
        developer.writeCode();
        System.out.println("Review code...");
    }
}

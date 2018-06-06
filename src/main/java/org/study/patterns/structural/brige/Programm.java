package org.study.patterns.structural.brige;

import org.study.entities.developers.Developer;

public abstract class Programm {
    protected Developer developer;

    protected Programm(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgramm();
}

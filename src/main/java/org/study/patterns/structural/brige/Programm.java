package org.study.patterns.structural.brige;

import org.study.developers.Developer;

public abstract class Programm {
    protected Developer developer;

    protected Programm(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgramm();
}

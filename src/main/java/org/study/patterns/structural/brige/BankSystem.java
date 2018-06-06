package org.study.patterns.structural.brige;

import org.study.entities.developers.Developer;

public class BankSystem extends Programm {

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgramm() {
        System.out.println("Bank system development in pogress");
        developer.writeCode();
    }
}

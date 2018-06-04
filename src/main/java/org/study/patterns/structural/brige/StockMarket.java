package org.study.patterns.structural.brige;

import org.study.developers.Developer;

public class StockMarket extends Programm {
    public StockMarket(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgramm() {
        System.out.println("Stock market programm in progress");
        developer.writeCode();
    }
}

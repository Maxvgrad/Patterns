package org.study.patterns.structural.brige;

import org.study.developers.CppDeveloper;
import org.study.developers.JavaDeveloper;
import org.study.patterns.Pattern;

import java.util.Arrays;

public class BrigePattern implements Pattern {

    private Programm[] programms = {
            new BankSystem(new JavaDeveloper()),
            new StockMarket(new CppDeveloper())
    };

    @Override
    public void execute() {
        Arrays.stream(programms).forEach(pr -> pr.developProgramm());
    }
}

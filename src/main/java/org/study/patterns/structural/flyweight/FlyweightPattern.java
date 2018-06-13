package org.study.patterns.structural.flyweight;

import org.study.entities.developers.Developer;
import org.study.patterns.Pattern;
import static org.study.utils.ProgrammingLanguage.*;

import java.util.ArrayList;
import java.util.List;

public class FlyweightPattern implements Pattern {
    @Override
    public void execute() {
        List<Developer> devList = new ArrayList<>();
        FlyweightFactory factory = new FlyweightFactory();

        devList.add(factory.getDevByLang(CPP));
        devList.add(factory.getDevByLang(CPP));
        devList.add(factory.getDevByLang(CPP));
        devList.add(factory.getDevByLang(CPP));
        devList.add(factory.getDevByLang(JAVA));
        devList.add(factory.getDevByLang(JAVA));
        devList.add(factory.getDevByLang(JAVA));
        devList.add(factory.getDevByLang(JAVA));
        devList.add(factory.getDevByLang(JAVA));

        devList.forEach(d -> d.writeCode());
        if (devList.stream().allMatch(d -> factory.getDevByLang(JAVA).equals(d) ||
                factory.getDevByLang(CPP).equals(d))) {
            System.out.println("Flyweight pattern is correct.");
        } else {
            System.out.println("Something goes wrong.");
        }


    }
}

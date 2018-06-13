package org.study.patterns.structural.flyweight;

import org.study.entities.developers.Developer;
import org.study.utils.ProgrammingLanguage;
import static org.study.patterns.creational.factorymethod.FactoryMethodPattern.createDeveloperFactory;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<ProgrammingLanguage, Developer> devMap;

    public FlyweightFactory() {
        devMap = new HashMap<>();
    }

    public Developer getDevByLang(ProgrammingLanguage language) {
        return devMap.computeIfAbsent(language,
                    key -> createDeveloperFactory(key).createDeveloper());
    }
}

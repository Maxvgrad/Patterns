package org.study.patterns.creational.factorymethod;

import org.study.entities.developers.CppDeveloper;
import org.study.entities.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}

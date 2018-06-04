package org.study.patterns.creational.factorymethod;

import org.study.developers.CppDeveloper;
import org.study.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}

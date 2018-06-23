package org.study.patterns.creational.factorymethod;

import org.study.entities.databases.Database;
import org.study.entities.developers.CppDeveloper;
import org.study.entities.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return createDeveloper(null);
    }

    @Override
    public Developer createDeveloper(Database db) {
        return new CppDeveloper();
    }
}

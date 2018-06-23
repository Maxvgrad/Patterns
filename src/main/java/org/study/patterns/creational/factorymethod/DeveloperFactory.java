package org.study.patterns.creational.factorymethod;

import org.study.entities.databases.Database;
import org.study.entities.developers.Developer;

public interface DeveloperFactory {
    Developer createDeveloper();
    Developer createDeveloper(Database db);
}

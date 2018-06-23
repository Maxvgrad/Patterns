package org.study.patterns.creational.factorymethod;

import org.study.entities.databases.Database;
import org.study.entities.developers.Developer;
import org.study.entities.developers.JavaDeveloper;

/**
 * Created by dev on 03.06.2018.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return createDeveloper(null);
    }

    @Override
    public Developer createDeveloper(Database db) {
        return new JavaDeveloper(db);
    }
}

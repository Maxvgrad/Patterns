package org.study.patterns.creational.factorymethod;

import org.study.developers.Developer;
import org.study.developers.JavaDeveloper;

/**
 * Created by dev on 03.06.2018.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}

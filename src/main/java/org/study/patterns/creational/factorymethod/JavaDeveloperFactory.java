package org.study.patterns.creational.factorymethod;

/**
 * Created by dev on 03.06.2018.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}

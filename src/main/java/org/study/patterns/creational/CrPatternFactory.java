package org.study.patterns.creational;

import org.study.patterns.Factory;
import org.study.patterns.Pattern;
import org.study.patterns.creational.abstractfactory.AbstractFactoryPattern;
import org.study.patterns.creational.builder.BuilderPattern;
import org.study.patterns.creational.factorymethod.FactoryMethodPattern;
import org.study.patterns.creational.prototype.PrototypePattern;
import org.study.patterns.creational.singleton.SingletonPattern;
import org.study.patterns.structural.brige.BrigePattern;
import org.study.utils.PatternCategories;
import org.study.utils.Patterns;

public class CrPatternFactory implements Factory {
    private final PatternCategories categorie = PatternCategories.CREATIONAL;
    @Override
    public Pattern createPattern(Patterns p) {
        switch (p) {
            case BRIGE: return new BrigePattern();
            case FACTORY_METHOD: return new FactoryMethodPattern();
            case ABSTRACT_FACTORY: return new AbstractFactoryPattern();
            case SINGLETON: return new SingletonPattern();
            case BUILDER: return new BuilderPattern();
            case PROTOTYPE: return new PrototypePattern();
            default: return null;
        }
    }

    @Override
    public String toString() {
        return categorie.name();
    }
}

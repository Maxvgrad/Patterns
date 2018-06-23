package org.study.patterns.structural;

import org.study.patterns.Factory;
import org.study.patterns.Pattern;
import org.study.patterns.creational.abstractfactory.AbstractFactoryPattern;
import org.study.patterns.creational.builder.BuilderPattern;
import org.study.patterns.creational.factorymethod.FactoryMethodPattern;
import org.study.patterns.creational.prototype.PrototypePattern;
import org.study.patterns.creational.singleton.SingletonPattern;
import org.study.patterns.structural.adapter.AdapterPattern;
import org.study.patterns.structural.brige.BrigePattern;
import org.study.patterns.structural.composite.CompositePattern;
import org.study.patterns.structural.decorator.DecoratorPattern;
import org.study.patterns.structural.facade.FacadePattern;
import org.study.patterns.structural.flyweight.FlyweightPattern;
import org.study.patterns.structural.proxy.ProxyPattern;
import org.study.utils.PatternCategories;
import org.study.utils.Patterns;

public class StrPatternFactory implements Factory {
    private final PatternCategories category = PatternCategories.STRUCTURAL;
    @Override
    public Pattern createPattern(Patterns p) {
        switch (p) {
            case ADAPTER: return new AdapterPattern();
            case COMPOSITE: return new CompositePattern();
            case FACADE: return new FacadePattern();
            case DECORATOR: return new DecoratorPattern();
            case FLYWEIGHT: return new FlyweightPattern();
            case PROXY: return new ProxyPattern();
            default: return null;
        }
    }

    @Override
    public String toString() {
        return category.name();
    }
}

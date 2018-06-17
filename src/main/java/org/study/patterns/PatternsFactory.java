package org.study.patterns;

import org.study.patterns.behavioral.StrategyPattern;
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
import org.study.utils.Patterns;

public class PatternsFactory {
    private PatternsFactory() {}

    public static Pattern createPattern(Patterns pattern) {
        switch(pattern) {
            case BRIGE: return new BrigePattern();
            case FACTORY_METHOD: return new FactoryMethodPattern();
            case ABSTRACT_FACTORY: return new AbstractFactoryPattern();
            case SINGLETON: return new SingletonPattern();
            case BUILDER: return new BuilderPattern();
            case PROTOTYPE: return new PrototypePattern();
            case ADAPTER: return new AdapterPattern();
            case COMPOSITE: return new CompositePattern();
            case FACADE: return new FacadePattern();
            case DECORATOR: return new DecoratorPattern();
            case FLYWEIGHT: return new FlyweightPattern();
            case PROXY: return new ProxyPattern();
            case STRATEGY: return new StrategyPattern();
            default: throw new IllegalArgumentException(
                    "Pattern '" + pattern + "' is not found.");
        }
    }
}

package org.study.utils;

public enum Patterns {
    /*Creational patterns*/
    FACTORY_METHOD("Factory method"), SINGLETON("Singleton"), BUILDER("Builder"),
    PROTOTYPE("Prototype"), ABSTRACT_FACTORY("Abstract factory"),
    /*Structural patterns*/
    BRIGE("Brige"), ADAPTER("Adapter"), COMPOSITE("Composite"), FACADE("Facade"),
    DECORATOR("Decorator"), FLYWEIGHT("Flyweight"), PROXY("Proxy"),
    /*Behabioral patterns*/
    STRATEGY("Strategy");

    private String name;
    Patterns(String name){
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}

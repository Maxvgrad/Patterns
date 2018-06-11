package org.study.utils;

public enum Patterns {
    /*Creational patterns*/
    FACTORY_METHOD("Factory method"), SINGLETON("Singleton"), BUILDER("Builder"),
    PROTOTYPE("Prototype"),
    /*Structural patterns*/
    BRIGE("Brige"), ADAPTER("Adapter"), COMPOSITE("Composite"), FACADE("Facade");

    Patterns(String name){
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return name;
    }
}

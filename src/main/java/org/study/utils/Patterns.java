package org.study.utils;

public enum Patterns {

    FACTORY_METHOD("Factory method"), SINGLETON("Singleton"), BUILDER("Builder"),
    PROTOTYPE("Prototype"),

    BRIGE("Brige"), ADAPTER("Adapter"), COMPOSITE("Composite");

    Patterns(String name){
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return name;
    }
}

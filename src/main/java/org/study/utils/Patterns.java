package org.study.utils;

public enum Patterns {

    FACTORY_METHOD("Factory method"), BRIGE("Brige");

    Patterns(String name){
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return name;
    }
}

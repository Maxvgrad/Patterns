package org.study.utils;

public enum PatternCategories {
    BEHAVIORAL("Behavioral"), CREATIONAL("Creational"), STRUCTURAL("Stractural"), OTHER("Other");

    String name;
    PatternCategories(String name) {
        this.name = name;
    }
}

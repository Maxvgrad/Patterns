package org.study.utils;

public enum PatternCategories {
    BEHAVIORAL("Behavioral"), CREATIONAL("Creational"), STRUCTURAL("Stractural");

    String name;
    PatternCategories(String name) {
        this.name = name;
    }
}

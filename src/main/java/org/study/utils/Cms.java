package org.study.utils;

public enum Cms {
    WORDPRESS("WordPress"), BITRIX("Bitrix");

    Cms(String name) {
        this.name = name;
    }

    private final String name;
}

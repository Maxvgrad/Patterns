package org.study.utils;

public enum ProgrammingLanguage {
    JAVA("java"), CPP("C++");

    private String programmingLanguage;
    ProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return programmingLanguage;
    }
}

package org.study.utils;

public enum ProgrammingLanguage {
    JAVA("java"), CPP("C++");

    private ProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    private String programmingLanguage;

    @Override
    public String toString() {
        return programmingLanguage;
    }
}

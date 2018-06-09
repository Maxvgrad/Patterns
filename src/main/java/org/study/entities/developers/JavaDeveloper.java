package org.study.entities.developers;

import org.study.utils.ProgrammingLanguage;

public class JavaDeveloper implements Developer {
    private final ProgrammingLanguage pl = ProgrammingLanguage.JAVA;
    @Override
    public void writeCode() {
        System.out.println("Java developers writes java code...");
    }
}

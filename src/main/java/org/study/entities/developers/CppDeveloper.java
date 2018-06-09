package org.study.entities.developers;

import org.study.utils.ProgrammingLanguage;

public class CppDeveloper implements Developer {

    private final ProgrammingLanguage pl = ProgrammingLanguage.CPP;

    @Override
    public void writeCode() {
        System.out.println  ("C++ Developer writes C++ code...");
    }
}

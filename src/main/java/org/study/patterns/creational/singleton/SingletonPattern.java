package org.study.patterns.creational.singleton;

import org.study.patterns.Pattern;

public class SingletonPattern implements Pattern {

    @Override
    public void execute() {
        ProgrammLogger logger = ProgrammLogger.getInstance();

        logger.addLogLine("Logger is created!");

        logger.showLogFile();
    }
}

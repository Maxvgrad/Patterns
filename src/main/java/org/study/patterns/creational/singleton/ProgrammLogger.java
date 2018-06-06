package org.study.patterns.creational.singleton;

class ProgrammLogger {
    private static ProgrammLogger logger;
    private static String logFile = "Log file\n";

    private ProgrammLogger() {
    }

    public static ProgrammLogger getInstance() {
        return logger == null ? logger = new ProgrammLogger() : logger;
    }

    public void addLogLine(String logLine) {
        logFile += logLine + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}

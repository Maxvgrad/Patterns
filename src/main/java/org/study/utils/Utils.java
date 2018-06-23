package org.study.utils;

public class Utils {
    private Utils() {}

    public static String getClassName() {
        return Thread.currentThread().getStackTrace()[2].getClassName();
    }
}

package org.study;

import org.study.patterns.Pattern;
import org.study.patterns.PatternsFactory;

import static org.study.utils.Patterns.*;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = PatternsFactory.createPattern(BRIGE);
        pattern.execute();
    }
}

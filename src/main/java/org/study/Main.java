package org.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.patterns.Pattern;
import org.study.patterns.PatternsFactory;
import org.study.utils.PatternCategories;
import org.study.utils.Utils;

import static org.study.utils.Patterns.*;

public class Main {
    private final static Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());
    public static void main(String[] args) {
        LOGGER.info("Start program");
        Pattern pattern = PatternsFactory.createPattern(INTERPRETER, PatternCategories.BEHAVIORAL);
        pattern.execute();
    }
}

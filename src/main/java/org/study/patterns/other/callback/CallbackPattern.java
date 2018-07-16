package org.study.patterns.other.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.patterns.Pattern;
import org.study.utils.Utils;

public class CallbackPattern implements Pattern {
    private static Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());

    @Override
    public void execute() {
        var t = new SimpleTask();
        t.executeWith(() -> LOGGER.info("Callback executed."));
    }
}

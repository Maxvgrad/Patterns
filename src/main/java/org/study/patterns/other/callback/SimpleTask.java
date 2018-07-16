package org.study.patterns.other.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.utils.Utils;

public class SimpleTask extends Task {
    private static final Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());

    @Override
    void execute() {
        LOGGER.info("Do job before callback execution.");
    }
}

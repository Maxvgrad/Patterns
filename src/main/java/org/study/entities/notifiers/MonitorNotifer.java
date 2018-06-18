package org.study.entities.notifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.entities.events.Event;
import org.study.utils.Levels;

public class MonitorNotifer extends Notifier {

    private static final Logger LOGGER = LoggerFactory.getLogger(MonitorNotifer.class);

    public MonitorNotifer() {
        super(Levels.ALL);
    }

    @Override
    public void notifyManager(Event event) {
        var time = System.nanoTime();
        super.notifyManager(event);
        time = System.nanoTime() - time;
        LOGGER.info("Chain duration = {}", time);
    }

    @Override
    protected void write(String msg) {

    }
}

package org.study.entities.notifiers;

import org.study.entities.events.Event;
import org.study.utils.Levels;

public class EmailNotifier extends Notifier {
    public EmailNotifier() {
        super(Levels.MIDDLE);
    }

    @Override
    protected void write(String msg) {
        System.out.println("Writing email: " + msg);
    }
}

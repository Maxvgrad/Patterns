package org.study.entities.notifiers;

import org.study.entities.events.Event;

public abstract class Notifier {
    private Notifier nextNotifier;
    private final int level;

    public Notifier(int level) {
        this.level = level;
    }

    public Notifier setNextNotifier(Notifier nextNotifier) {

        if (this.nextNotifier != null) {
            this.nextNotifier.setNextNotifier(nextNotifier);
        } else {
            this.nextNotifier = nextNotifier;
        }
        return this;
    }

    public void notifyManager(Event event) {
        if (event.getLevel() >= level) {
            write(event.getMsg());
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(event);
        }
    }

    protected abstract void write(String msg);


    public Notifier getNextNotifier() {
        return nextNotifier;
    }
}

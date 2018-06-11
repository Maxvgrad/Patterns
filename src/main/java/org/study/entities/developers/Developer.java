package org.study.entities.developers;

import org.study.entities.trackers.BugTracker;

public interface Developer {
    default void doJobBeforeDeadline(BugTracker tracker) {
        if (tracker.isActive()) {
            writeCode();
        } else {
            System.out.println("Play kicker...");
        }
    }
    void writeCode();
}

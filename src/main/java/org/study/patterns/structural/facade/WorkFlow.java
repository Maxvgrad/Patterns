package org.study.patterns.structural.facade;

import org.study.entities.developers.Developer;
import org.study.entities.trackers.BugTracker;

public class WorkFlow {
    private Developer developer;
    private BugTracker tracker;
    private Job job;



    public WorkFlow(Job job, Developer developer, BugTracker tracker) {
        this.job = job;
        this.developer = developer;
        this.tracker = tracker;
    }

    public void startDevelopment() {
        tracker.setActive(true);
        job.doJob();
        developer.doJobBeforeDeadline(tracker);
    }

    public void pauseDevelopment() {
        tracker.setActive(false);
        job.putOffJob();
        developer.doJobBeforeDeadline(tracker);
    }
}

package org.study.patterns.structural.facade;

public class Job {
    public void doJob() {
        System.out.println("Job in process");
    }

    public void putOffJob() {
        System.out.println("Job is postponed...");
    }
}

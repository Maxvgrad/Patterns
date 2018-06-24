package org.study.patterns.behavioral.observer;

public interface Subject {
    boolean subscribe(Observer obs);
    boolean unsubscribe(Observer obs);

    void setState(int stateCode);
    int getState();
}

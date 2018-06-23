package org.study.patterns.behavioral.command;

public interface Command<T> {

    void execute();

    T execute(T arg);

    T execute(Long arg);
}

package org.study.patterns.behavioral.command;

import org.study.entities.databases.Database;

public class SelectCommand<T> implements Command<T> {

    private Database<T> database;

    public SelectCommand(Database<T> database) {
        this.database = database;
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T execute(T arg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T execute(Long arg) {
        return database.select(arg);
    }
}

package org.study.patterns.behavioral.command;

import org.study.entities.databases.Database;

public class AddCommand<T> implements Command<T> {
    private Database<T> database;

    public AddCommand(Database<T> database) {
        this.database = database;
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T execute(T arg) {
        database.add(arg);
        return null;
    }

    @Override
    public T execute(Long arg) {
        throw new UnsupportedOperationException();
    }
}

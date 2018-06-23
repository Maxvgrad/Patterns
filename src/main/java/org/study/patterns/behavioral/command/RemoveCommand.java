package org.study.patterns.behavioral.command;

import org.study.entities.databases.Database;

public class RemoveCommand<T> implements Command<T>{
    private Database<T> database;

    public RemoveCommand(Database<T> database) {
        this.database = database;
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T execute(Long arg) {
        return database.remove(arg);
    }

    @Override
    public T execute(T obj) {
        throw new UnsupportedOperationException();
    }
}

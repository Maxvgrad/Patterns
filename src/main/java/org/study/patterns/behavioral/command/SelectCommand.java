package org.study.patterns.behavioral.command;

import org.study.entities.databases.Database;

public class SelectCommand implements Command {

    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select(3);
    }
}

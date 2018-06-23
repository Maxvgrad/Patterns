package org.study.entities.developers;

import org.study.entities.databases.Database;
import org.study.patterns.behavioral.command.AddCommand;
import org.study.patterns.behavioral.command.RemoveCommand;
import org.study.patterns.behavioral.command.SelectCommand;

public class JavaDeveloper implements Developer {
    private SelectCommand select;
    private RemoveCommand remove;
    private AddCommand add;

    public JavaDeveloper() {
        this(null);
    }

    public JavaDeveloper(Database database) {
        this.select = new SelectCommand(database);
        this.remove = new RemoveCommand(database);
        this.add =    new AddCommand(database);
    }

    @Override
    public void writeCode() {
        System.out.println("Java developers writes java code...");
    }

    public Object select(Long id) {
        return select.execute(id);
    }

    public void add(Object obj) {
        add.execute(obj);
    }

    public Object remove(Long id) {
        return remove.execute(id);
    }
}

package org.study.patterns.structural.adapter;

import org.study.entities.databases.Database;
import org.study.entities.developers.Developer;
import org.study.patterns.Pattern;

public class AdapterPattern implements Pattern{
    @Override
    public void execute() {
        Database<Developer> db = new AdapterAppToDb();

        db.add(null);
        db.remove(2L);

    }
}

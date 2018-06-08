package org.study.patterns.structural.adapter;

import org.study.entities.databases.Database;

public class AdapterAppToDb extends Application implements Database {
    @Override
    public void add(Object obj) {
        addObj(obj);
    }

    @Override
    public Object remove(int id) {
        return removeObj(id);
    }
}

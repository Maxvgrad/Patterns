package org.study.patterns.structural.adapter;

import org.study.entities.databases.Database;

public class AdapterAppToDb extends Application implements Database {

    @Override
    public Object select(Long id) {
        return null;
    }

    @Override
    public void add(Object obj) {
        addObj(obj);
    }

    @Override
    public Object remove(Long id) {
        return removeObj(id);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

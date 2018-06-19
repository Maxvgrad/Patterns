package org.study.entities.databases;

public interface Database<T> {

    void add(T obj);

    T select(int id);

    T remove(int id);
}

package org.study.entities.databases;

public interface Database<T> {

    void add(T obj);

    T remove(int id);
}

package org.study.entities.databases;

public interface Database<T> {

    void add(T obj);

    T select(Long id);

    T remove(Long id);
}

package org.study.entities.databases;

public class OracleDatabase<T> implements Database<T> {
    @Override
    public void add(T obj) {
        System.out.println("Add object " + obj);
    }

    @Override
    public T remove(int id) {
        System.out.println("Remove obj id: " + id);
        return null;
    }

    @Override
    public T select(int id) {
        System.out.println("Select obj id: " + id);
        return null;
    }
}

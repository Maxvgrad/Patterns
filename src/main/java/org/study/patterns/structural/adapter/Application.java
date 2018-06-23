package org.study.patterns.structural.adapter;

public class Application<T> {
    public void addObj(T obj) {
        System.out.println("App add object");
    }

    public T removeObj(Long id) {
        System.out.println("Remove object: " + id);
        return null;
    }
}

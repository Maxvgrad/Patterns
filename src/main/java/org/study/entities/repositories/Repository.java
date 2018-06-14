package org.study.entities.repositories;

public interface Repository {
    void cloneRepo();
    void checkout(String sha);
}

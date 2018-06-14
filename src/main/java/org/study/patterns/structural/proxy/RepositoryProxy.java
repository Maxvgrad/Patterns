package org.study.patterns.structural.proxy;

import org.study.entities.repositories.GitHubRepository;
import org.study.entities.repositories.Repository;

import java.util.Objects;

public class RepositoryProxy implements Repository {
    private String url;
    private Repository repository;

    public RepositoryProxy(String url) {
        Objects.requireNonNull(url);
        this.url = url;
    }

    @Override
    public void cloneRepo() {
        repository.cloneRepo();
    }

    @Override
    public void checkout(String sha) {
        var repository = Objects.requireNonNullElseGet(this.repository,
                                    () -> this.repository = new GitHubRepository(url));
        repository.checkout(sha);
    }
}

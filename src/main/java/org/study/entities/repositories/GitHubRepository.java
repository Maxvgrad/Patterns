package org.study.entities.repositories;

import java.util.Objects;

public class GitHubRepository implements Repository {
    private String url;
    private String commit;

    public GitHubRepository(String url) {
        this.url = url;
        this.commit = "" + this.hashCode();
        cloneRepo();
    }

    @Override
    public void cloneRepo() {
        System.out.println(String.format("Cloning repository: '%s'", url));
        System.out.printf("Repo on commit: %s\n", commit);
    }

    @Override
    public void checkout(String sha) {
        Objects.requireNonNull(sha);
        System.out.printf("Checking out from: %s to: %s\n", commit, sha);
        commit = sha;
    }
}

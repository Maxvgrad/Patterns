package org.study.patterns.structural.proxy;

import org.study.patterns.Pattern;

public class ProxyPattern implements Pattern {
    @Override
    public void execute() {
        var repository = new RepositoryProxy("git@github.com:Maxvgrad/Patterns.git");
        repository.checkout("" + this.hashCode());
    }
}

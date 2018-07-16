package org.study.patterns.other.callback;

import java.util.Objects;

public abstract class Task {
    void executeWith(Callback c) {
        Objects.requireNonNull(c);
        execute();
        c.execute();
    }

    abstract void execute();
}

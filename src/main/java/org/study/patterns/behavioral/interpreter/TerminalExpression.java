package org.study.patterns.behavioral.interpreter;

import java.util.Objects;

public class TerminalExpression implements Expresstion {
    private final String data;

    public TerminalExpression(String data) {
        Objects.requireNonNull(data, "Data can not be null");
        this.data = data.toUpperCase();
    }

    @Override
    public boolean interpret(String context) {
        Objects.requireNonNull(context, "Context cannot be null");
        return context.toUpperCase().contains(data);
    }
}

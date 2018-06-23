package org.study.patterns.behavioral.interpreter;

public class AndExpression implements Expresstion {
    private final Expresstion expOne;
    private final Expresstion expTwo;

    public AndExpression(Expresstion expOne, Expresstion expTwo) {
        this.expOne = expOne;
        this.expTwo = expTwo;
    }

    @Override
    public boolean interpret(String context) {
        return expOne.interpret(context) && expTwo.interpret(context);
    }
}

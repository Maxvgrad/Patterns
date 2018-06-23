package org.study.patterns.behavioral.interpreter;

class JavaExpressionBuilder {
    private JavaExpressionBuilder() {}

    static Expresstion getInstance() {
        return new AndExpression(
                new TerminalExpression("java"),
                new TerminalExpression("devops"));
    }
}

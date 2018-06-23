package org.study.patterns.behavioral.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.patterns.Pattern;
import org.study.utils.Utils;

import java.util.Arrays;
import java.util.List;

public class InterpreterPattern implements Pattern {

    private final Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());
    private final List<String> resumes = Arrays.asList(
            "Hello worold", "Java", "Spring", "DevOps java", "C++");

    @Override
    public void execute() {
        resumes.stream()
                .filter(r -> JavaExpressionBuilder.getInstance().interpret(r))
                .forEach(LOGGER::info);
    }
}

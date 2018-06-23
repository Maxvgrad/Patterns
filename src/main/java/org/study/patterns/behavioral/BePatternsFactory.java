package org.study.patterns.behavioral;

import org.study.patterns.Factory;
import org.study.patterns.Pattern;
import org.study.patterns.behavioral.chainofresp.ChainOfRespPattern;
import org.study.patterns.behavioral.command.CommandPattern;
import org.study.patterns.behavioral.interpreter.InterpreterPattern;
import org.study.patterns.behavioral.strategy.StrategyPattern;
import org.study.utils.PatternCategories;
import org.study.utils.Patterns;

public class BePatternsFactory implements Factory {
    private final PatternCategories categorie = PatternCategories.BEHAVIORAL;
    @Override
    public Pattern createPattern(Patterns p) {
        switch (p) {
            case STRATEGY:
                return new StrategyPattern();
            case CHAINOFRESP:
                return new ChainOfRespPattern();
            case COMMAND:
                return new CommandPattern();
            case INTERPRETER: return new InterpreterPattern();
            default: return null;
        }
    }

    @Override
    public String toString() {
        return categorie.name();
    }
}

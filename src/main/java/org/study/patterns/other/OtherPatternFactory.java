package org.study.patterns.other;

import org.study.patterns.Factory;
import org.study.patterns.Pattern;
import org.study.patterns.other.callback.CallbackPattern;
import org.study.utils.PatternCategories;
import org.study.utils.Patterns;

public class OtherPatternFactory implements Factory {
    private final static PatternCategories CATEGORY = PatternCategories.OTHER;

    @Override
    public Pattern createPattern(Patterns p) {
        switch (p) {
            case CALLBACK: return new CallbackPattern();
            default: return null;
        }
    }

    @Override
    public String toString() {
        return CATEGORY.name();
    }
}

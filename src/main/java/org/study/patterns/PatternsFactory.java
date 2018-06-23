package org.study.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.patterns.behavioral.BePatternsFactory;
import org.study.patterns.creational.CrPatternFactory;
import org.study.patterns.structural.StrPatternFactory;
import org.study.utils.PatternCategories;
import org.study.utils.Patterns;
import org.study.utils.Utils;

import java.util.EnumSet;

public class PatternsFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());
    private static final EnumSet<PatternCategories> patternCategories = EnumSet.allOf(PatternCategories.class);
    private PatternsFactory() {}

    public static Pattern createPattern(Patterns p) {
        return createPattern(p, null);
    }
    /**
     * Create pattern for specified pattern name and category
     */
    public static Pattern createPattern(Patterns p, PatternCategories pc) {
        LOGGER.info("Creating pattern '{}'", p);
        return getInstance(p, getFactory(pc));
    }

    /**
     * Creates categories factory
     */
    private static Factory getFactory(PatternCategories pc) {
        if (pc == null) return null;
        switch (pc) {
            case BEHAVIORAL: return new BePatternsFactory();
            case CREATIONAL: return new CrPatternFactory();
            case STRUCTURAL: return new StrPatternFactory();
        }
        throw new IllegalArgumentException(
                String.format("Pattern category '%s' does not exists", pc.name()));
    }
    /**
     * Creates pattern instance*/
    private static Pattern getInstance(Patterns p, Factory f) {
        Pattern result;
        if (f != null) {
            if ((result = f.createPattern(p)) != null) {
                return result;
            }
            else {
                LOGGER.warn("Pattern category '{}' is not correct for pattern '{}'",
                        f.toString(), p.name());
            }
        }
        for (PatternCategories pc : patternCategories) {
            if ((f = getFactory(pc)) != null && (result = f.createPattern(p)) != null) {
                return result;
            }
        }
        throw new IllegalArgumentException(String.format("Pattern '%s' is not supported", p.name()));
    }
}

package org.study.patterns.behavioral;

import org.study.entities.factories.CharacterFactory;
import org.study.entities.weapon.KnifeBehaviour;
import org.study.patterns.Pattern;

import static org.study.utils.Role.KING;

public class StrategyPattern implements Pattern {
    @Override
    public void execute() {
        var king = CharacterFactory.createCharacter(KING, new KnifeBehaviour());
        king.fight();
    }
}

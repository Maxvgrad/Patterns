package org.study.entities.factories;

import org.study.entities.characters.*;
import org.study.entities.characters.Character;
import org.study.entities.weapon.WeaponBehavior;
import org.study.utils.Role;

public class CharacterFactory {

    private CharacterFactory() {}

    public static Character createCharacter(Role role, WeaponBehavior weapon) {
        switch (role) {
            case TROLL: return new Troll(weapon);
            case KING: return new King(weapon);
            case KNIGHT: return new Knight(weapon);
            case ANONYMOUS: return new Anonymous(weapon);
            default: throw new IllegalArgumentException(
                    String.format("Role '%s' does not supported.", role.getRole()));
        }
    }
}

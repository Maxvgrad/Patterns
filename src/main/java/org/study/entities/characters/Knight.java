package org.study.entities.characters;

import org.study.entities.weapon.WeaponBehavior;
import org.study.utils.Role;

public class Knight extends CharacterSkeleton {
    public Knight(WeaponBehavior weapon) {
        super(Role.KNIGHT, weapon);
    }
}

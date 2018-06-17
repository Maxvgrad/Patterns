package org.study.entities.characters;

import org.study.entities.weapon.WeaponBehavior;
import org.study.utils.Role;

public class Troll extends CharacterSkeleton {
    public Troll(WeaponBehavior weapon) {
        super(Role.TROLL, weapon);
    }
}

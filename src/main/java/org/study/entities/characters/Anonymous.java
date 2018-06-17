package org.study.entities.characters;

import org.study.entities.weapon.WeaponBehavior;
import org.study.utils.Role;

public class Anonymous extends CharacterSkeleton {
    public Anonymous(WeaponBehavior weapon) {
        super(Role.ANONYMOUS, weapon);
    }
}

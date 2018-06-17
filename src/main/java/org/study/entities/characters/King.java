package org.study.entities.characters;

import org.study.entities.weapon.WeaponBehavior;
import static org.study.utils.Role.*;

public class King extends CharacterSkeleton{
    public King(WeaponBehavior weapon) {
        super(KING, weapon);
    }
}

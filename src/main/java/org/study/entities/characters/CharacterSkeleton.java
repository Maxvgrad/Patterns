package org.study.entities.characters;

import org.study.entities.weapon.BareHandsBehavior;
import org.study.entities.weapon.WeaponBehavior;
import org.study.utils.Role;

import java.util.Objects;

public abstract class CharacterSkeleton implements Character{
    protected WeaponBehavior weapon;
    private final String name;

    protected CharacterSkeleton(Role role, WeaponBehavior weapon) {
        this.name = Objects.requireNonNullElse(role.getRole(), "ANONYMOUS CHARACTER");
        setWeapon(weapon);
    }

    @Override
    public int fight() {
        System.out.println(String.format("%s starts fighting", name));
        return weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = Objects.requireNonNullElse(weapon, new BareHandsBehavior());
    }
}

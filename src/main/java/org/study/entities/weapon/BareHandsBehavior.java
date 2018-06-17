package org.study.entities.weapon;

public class BareHandsBehavior implements WeaponBehavior {
    private final int POWER = 1;
    @Override
    public int useWeapon() {
        System.out.println("Bare hands attack...");
        return POWER;
    }
}

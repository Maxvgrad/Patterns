package org.study.entities.weapon;

public class KnifeBehaviour implements WeaponBehavior {
    private static final int POWER = 3;
    @Override
    public int useWeapon() {
        System.out.println("Cutting with a knife...");
        return POWER;
    }
}

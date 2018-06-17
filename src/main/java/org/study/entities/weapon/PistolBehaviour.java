package org.study.entities.weapon;

public class PistolBehaviour implements WeaponBehavior {
    private static final int POWER = 7;
    @Override
    public int useWeapon() {
        System.out.println("Shooting a pistol...");
        return POWER;
    }
}

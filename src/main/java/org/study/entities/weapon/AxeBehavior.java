package org.study.entities.weapon;

public class AxeBehavior implements WeaponBehavior {
    private final static int POWER = 4;
    @Override
    public int useWeapon() {
        System.out.println("Chopping with an axe...");
        return POWER;
    }
}

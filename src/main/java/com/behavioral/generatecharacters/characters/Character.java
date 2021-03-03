package com.behavioral.generatecharacters.characters;

import com.behavioral.generatecharacters.weapons.WeaponBehavior;

public abstract class Character {
    public WeaponBehavior weaponBehavior;
    public abstract void fight();
    public void setWeapon(WeaponBehavior w) {
        this.weaponBehavior = w;
    }
}

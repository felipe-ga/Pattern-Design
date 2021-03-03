package com.behavioral.generatecharacters.characters;

import com.behavioral.generatecharacters.weapons.SwordBehavior;

public class Queen extends Character{
    public Queen(){
        setWeapon(new SwordBehavior());
    }
    @Override
    public void fight() {
        System.out.println("I am fighting like a Queen");
    }
}

package com.behavioral.generatecharacters.gui;

import com.behavioral.generatecharacters.characters.Queen;
import com.behavioral.generatecharacters.characters.Troll;
import com.behavioral.generatecharacters.characters.Character;
import com.behavioral.generatecharacters.weapons.AxeBehavior;

public class GeneratorCharacters {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.weaponBehavior.useWeapon();
        queen.setWeapon(new AxeBehavior());
        queen.weaponBehavior.useWeapon();
    }
}

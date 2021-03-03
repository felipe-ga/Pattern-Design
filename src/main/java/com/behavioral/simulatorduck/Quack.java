package com.behavioral.simulatorduck;

import javax.swing.plaf.IconUIResource;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("i am quacking");
    }
}

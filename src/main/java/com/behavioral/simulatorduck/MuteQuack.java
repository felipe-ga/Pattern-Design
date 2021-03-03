package com.behavioral.simulatorduck;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I cant make a sound");
    }
}

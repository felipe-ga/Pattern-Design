package com.behavioral.simulatorduck;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("i am squeaking");
    }
}

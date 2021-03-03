package com.behavioral.simulatorduck;

public class MallarDuck extends Duck{
    public MallarDuck(){
        flyBehavior = new FlynoWay();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("i am a mallar duck");
    }
}

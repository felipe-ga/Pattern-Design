package com.behavioral.simulatorduck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

    }
}

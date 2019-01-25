package com.home.designpattern.designpatterns.AbstractFactory;

public class Archer extends Adventurer {
    @Override
    public void states() {
        System.out.println("我是弓箭手，裝備: ");
        weapon.info();
        System.out.println("\n");
        clothes.info();
        System.out.println("\n");
    }
}

package com.home.designpattern.designpatterns.AbstractFactory;

/**
 *  鬥士
 */
public class Warrior extends Adventurer {
    @Override
    public void states() {
        System.out.println("我是鬥士，裝備: ");
        weapon.info();
        System.out.println("\n");
        clothes.info();
        System.out.println("\n");
    }
}

package com.home.designpattern.designpatterns.Factory;

public class Warrior implements Adventurer {
    @Override
    public String getType() {
        System.out.println("我是鬥士!捨我其誰!");
        return this.getClass().getSimpleName();
    }
}

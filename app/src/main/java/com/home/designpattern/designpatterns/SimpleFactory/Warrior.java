package com.home.designpattern.designpatterns.SimpleFactory;

/**
 *  鬥士
 */
public class Warrior implements Adventurer {
    @Override
    public String getType() {
        System.out.println("我是鬥士!This is 斯巴拉希!");
        return this.getClass().getSimpleName();
    }
}

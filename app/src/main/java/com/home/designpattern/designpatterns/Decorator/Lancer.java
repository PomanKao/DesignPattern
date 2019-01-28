package com.home.designpattern.designpatterns.Decorator;

/**
 * 長槍兵(ConcreteComponent)
 */
public class Lancer implements Adventurer {
    // 冒險者名字
    private String name;

    // 冒險者被創立時，要有名字
    public Lancer(String name) {
        this.name = name;
    }

    // 攻擊
    @Override
    public void attack() {
        System.out.println("長槍攻擊 by " + name);
    }
}

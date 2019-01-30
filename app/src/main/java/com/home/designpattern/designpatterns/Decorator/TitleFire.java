package com.home.designpattern.designpatterns.Decorator;

/**
 * 稱號-燃燒(ConcreteDecorator)
 */
public class TitleFire extends Title {

    public TitleFire(Adventurer adventurer) {
        super(adventurer);
    }

    // 稱號讓攻擊增加燃燒
    @Override
    public void attack() {
        System.out.println("燃燒 ");
        super.attack();
    }

    // 取得稱號的新技能
    public void fireBall() {
        System.out.println("火球術");
    }
}

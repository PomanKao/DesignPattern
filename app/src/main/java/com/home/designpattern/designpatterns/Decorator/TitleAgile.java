package com.home.designpattern.designpatterns.Decorator;

/**
 * 稱號-敏捷(ConcreteDecorator)
 */
public class TitleAgile extends Title {

    public TitleAgile(Adventurer adventurer) {
        super(adventurer);
    }

    @Override
    public void attack() {
        System.out.println("快速 ");
        super.attack();
    }

    // 取得稱號的新技能
    public void useFlash() {
        System.out.println("使用瞬間移動");
    }
}

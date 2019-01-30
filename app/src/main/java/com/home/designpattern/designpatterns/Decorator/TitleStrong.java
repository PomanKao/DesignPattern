package com.home.designpattern.designpatterns.Decorator;

/**
 * 稱號-強壯(ConcreteDecorator)
 */
public class TitleStrong extends Title {

    public TitleStrong(Adventurer adventurer) {
        super(adventurer);
    }

    // 稱號讓攻擊力增加
    @Override
    public void attack() {
        System.out.println("猛力 ");
        super.attack();
    }
}

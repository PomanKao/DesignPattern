package com.home.designpattern.designpatterns.Strategy;

/**
 * 使用技能(ConcreteStrategy)
 */
public class UseSkill implements FightStrategy {
    @Override
    public void execute() {
        System.out.println("使用技能攻擊，為普攻的兩倍傷害");
    }
}

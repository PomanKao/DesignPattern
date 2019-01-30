package com.home.designpattern.designpatterns.Strategy;

/**
 * 一般攻擊
 */
public class NormalAttack implements FightStrategy {

    @Override
    public void execute() {
        System.out.println("使用一般攻擊");
    }
}

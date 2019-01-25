package com.home.designpattern.designpatterns.Strategy;

/**
 * 使用道具(ConcreteStrategy)
 */
public class UseItem implements FightStrategy {
    @Override
    public void execute() {
        System.out.println("使用道具，丟火把");
    }
}

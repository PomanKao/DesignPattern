package com.home.designpattern.designpatterns.Strategy;

/**
 * 冒險者(Context)
 */
public class Adventurer {
    FightStrategy strategy;

    /**
     * 攻擊
     */
    public void attack() {
        // 預設為普通攻擊
        if (strategy == null) {
            strategy = new NormalAttack();
        }
        strategy.execute();
    }

    /**
     * 選擇不同攻擊方式
     */
    public void choiceStrategy(FightStrategy strategy) {
        this.strategy = strategy;
    }

}

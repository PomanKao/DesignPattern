package com.home.designpattern.designpatterns.AbstractFactory;

/**
 *  武器介面
 */
public abstract class Weapon {
    protected int atk;      //攻擊力
    protected int range;    //攻擊範圍

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    // 顯示武器名稱跟資訊
    public void info() {
        System.out.println("\t" + this.getClass().getSimpleName() + " atk: " + atk + " range: " + range);
    }
}

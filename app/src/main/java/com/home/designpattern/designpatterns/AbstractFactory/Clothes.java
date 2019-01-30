package com.home.designpattern.designpatterns.AbstractFactory;

/**
 *  上衣介面
 */
public abstract class Clothes {
    protected int def;  // 防禦力

    // 顯示上衣名稱跟防禦力資訊
    public void info() {
        System.out.println("\t" + this.getClass().getSimpleName() + " def: " + def);
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}

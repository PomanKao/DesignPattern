package com.home.designpattern.designpatterns.AbstractFactory;

/**
 *  冒險者
 */
public abstract class Adventurer {
    protected Weapon weapon;       // 武器
    protected Clothes clothes;     // 裝備

    /**
     *  冒險者的狀態
     */
    public abstract void states();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
}

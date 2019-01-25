package com.home.designpattern.designpatterns.AbstractFactory;

/**
 * 專門生產弓箭手裝備的工廠
 */
public class ArcherEquipFactory implements EquipFactory {
    @Override
    public Weapon productWeapon() {
        Bow bow = new Bow();
        bow.setAtk(5);
        bow.setRange(10);
        return bow;
    }

    @Override
    public Clothes productArmor() {
        Leather leather = new Leather();
        leather.setDef(5);
        return leather;
    }
}

package com.home.designpattern.designpatterns.AbstractFactory;

/**
 *  專門生產鬥士裝備的工廠
 */
public class WarriorEquipFactory implements EquipFactory {
    @Override
    public Weapon productWeapon() {
        LongSword longSword = new LongSword();
        longSword.setAtk(10);
        longSword.setRange(2);
        return longSword;
    }

    @Override
    public Clothes productArmor() {
        Armor armor = new Armor();
        armor.setDef(10);
        return armor;
    }
}

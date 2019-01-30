package com.home.designpattern.designpatterns.AbstractFactory;

/**
 *  裝備工廠介面-定義每一間工廠應該生產哪些東西
 */
public interface EquipFactory {
    /**
     * 製造武器
     * @return
     */
    Weapon productWeapon();

    /**
     *  製造裝備
     * @return
     */
    Clothes productArmor();

}

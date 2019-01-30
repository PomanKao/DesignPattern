package com.home.designpattern;

import com.home.designpattern.designpatterns.AbstractFactory.ArcherEquipFactory;
import com.home.designpattern.designpatterns.AbstractFactory.Clothes;
import com.home.designpattern.designpatterns.AbstractFactory.EquipFactory;
import com.home.designpattern.designpatterns.AbstractFactory.Weapon;

import org.junit.Test;

public class EquipFactoryTest {
    private EquipFactory equipFactory;

    @Test
    /**
     *  測試工廠是否能正確生產設備
     */
    public void equipFactoryTest() {
        System.out.println("==========抽象工廠模式測試==========");

        // 幫弓箭手生產裝備
        equipFactory = new ArcherEquipFactory();
        Clothes clothes = equipFactory.productArmor();
        Weapon weapon = equipFactory.productWeapon();
    }
}

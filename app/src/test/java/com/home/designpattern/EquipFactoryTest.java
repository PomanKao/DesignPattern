package com.home.designpattern;

import com.home.designpattern.designpatterns.AbstractFactory.Adventurer;
import com.home.designpattern.designpatterns.AbstractFactory.ArcherEquipFactory;
import com.home.designpattern.designpatterns.AbstractFactory.ArcherTrainingCamp;
import com.home.designpattern.designpatterns.AbstractFactory.Clothes;
import com.home.designpattern.designpatterns.AbstractFactory.EquipFactory;
import com.home.designpattern.designpatterns.AbstractFactory.TrainingCamp;
import com.home.designpattern.designpatterns.AbstractFactory.WarriorEquipFactory;
import com.home.designpattern.designpatterns.AbstractFactory.WarriorTrainingCamp;
import com.home.designpattern.designpatterns.AbstractFactory.Weapon;

import org.junit.Assert;
import org.junit.Test;

public class EquipFactoryTest {
//    private EquipFactory equipFactory;

    @Test
    /**
     *  測試工廠是否能正確生產設備
     */
    public void equipFactoryTest() {
        System.out.println("==========抽象工廠模式測試==========");

        // 幫弓箭手生產裝備
        EquipFactory equipFactory = new ArcherEquipFactory();
        Clothes archerLeather = equipFactory.productArmor();
        Weapon archerBow = equipFactory.productWeapon();

        // 比對裝備資料
        // 皮甲防禦應該為5，弓的攻擊為5，攻擊範圍為10
        Assert.assertEquals(5, archerLeather.getDef());
        Assert.assertEquals(5, archerBow.getAtk());
        Assert.assertEquals(10, archerBow.getRange());

        // 幫鬥士生產裝備
        equipFactory = new WarriorEquipFactory();
        Clothes armor = equipFactory.productArmor();
        Weapon longSword = equipFactory.productWeapon();

        // 比對裝備資料
        // 盔甲防禦應該為10，長劍的攻擊為10，攻擊範圍為2
        Assert.assertEquals(10, armor.getDef());
        Assert.assertEquals(10, longSword.getAtk());
        Assert.assertEquals(2, longSword.getRange());

        // 弓箭手訓練營
        TrainingCamp camp = new ArcherTrainingCamp();
        // 訓練弓箭手
        Adventurer archer = camp.trainAdventurer();

        // 鬥士訓練營
        camp = new WarriorTrainingCamp();
        // 訓練鬥士
        Adventurer warrior = camp.trainAdventurer();

        archer.states();
        warrior.states();
    }
}

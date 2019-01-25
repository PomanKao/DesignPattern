package com.home.designpattern.designpatterns.AbstractFactory;

/**
 *  弓箭手訓練營
 */
public class ArcherTrainingCamp implements TrainingCamp {
    private static EquipFactory factory = new ArcherEquipFactory();
    @Override
    public Adventurer trainAdventurer() {
        Archer archer = new Archer();
        // ...進行基本訓練
        // ...弓箭手訓練
        // 訓練完成配發配備
        archer.setWeapon(factory.productWeapon());
        archer.setClothes(factory.productArmor());
        return archer;
    }
}

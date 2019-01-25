package com.home.designpattern.designpatterns.AbstractFactory;

public class WarriorTrainingCamp implements TrainingCamp {
    private static EquipFactory factory = new WarriorEquipFactory();

    @Override
    public Adventurer trainAdventurer() {
        Warrior warrior = new Warrior();
        // ...進行基本訓練
        // ...鬥士訓練課程
        // ...訓練完成配備裝備
        warrior.setWeapon(factory.productWeapon());
        warrior.setClothes(factory.productArmor());
        return warrior;
    }
}

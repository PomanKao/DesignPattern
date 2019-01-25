package com.home.designpattern.designpatterns.Factory;

public class WarriorTrainingCamp implements TrainingCamp {
    @Override
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個鬥士");
        return new Warrior();
    }
}

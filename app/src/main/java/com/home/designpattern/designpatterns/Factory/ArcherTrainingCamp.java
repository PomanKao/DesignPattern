package com.home.designpattern.designpatterns.Factory;

public class ArcherTrainingCamp implements TrainingCamp {
    @Override
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個弓箭手");
        return new Archer();
    }
}

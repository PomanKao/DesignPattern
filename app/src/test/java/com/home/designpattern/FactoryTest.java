package com.home.designpattern;

import com.home.designpattern.designpatterns.Factory.Adventurer;
import com.home.designpattern.designpatterns.Factory.ArcherTrainingCamp;
import com.home.designpattern.designpatterns.Factory.TrainingCamp;
import com.home.designpattern.designpatterns.Factory.WarriorTrainingCamp;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void test() {
        System.out.println("==========工廠模式測試==========");

        // 訓練營訓練冒險者
        // 先用弓箭手訓練營訓練弓箭手
        TrainingCamp trainingCamp = new ArcherTrainingCamp();
        Adventurer adventurer1 = trainingCamp.trainAdventurer();

        // 用鬥士訓練營訓練鬥士
        trainingCamp = new WarriorTrainingCamp();
        Adventurer adventurer2 = trainingCamp.trainAdventurer();

        // 確認是否為訓練出我們想要的冒險者
        Assert.assertEquals(adventurer1.getType(), "Archer");
        Assert.assertEquals(adventurer2.getType(), "Warrior");
        // adventurer2應該為Warrior，而不是Knight，故會報錯
        //Assert.assertEquals(adventurer2.getType(), "Knight");
    }

}

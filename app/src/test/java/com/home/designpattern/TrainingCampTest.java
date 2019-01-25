package com.home.designpattern;

import com.home.designpattern.designpatterns.SimpleFactory.Adventurer;
import com.home.designpattern.designpatterns.SimpleFactory.TrainingCamp;

import org.junit.Assert;
import org.junit.Test;

public class TrainingCampTest {
    @Test
    public void test() {
        System.out.println("==========簡易工廠模式==========");

        // 訓練營訓練冒險者
        Adventurer adventurer1 = TrainingCamp.trainAdventurer("archer");
        Adventurer adventurer2 = TrainingCamp.trainAdventurer("warrior");

        // 確認是否真的訓練出我們想要的冒險者
        Assert.assertEquals(adventurer1.getType(), "Archer");
        Assert.assertEquals(adventurer2.getType(), "Warrior");
        // adventurer2應該是Warrior，而不是Knight，因此這行會報錯
        Assert.assertEquals(adventurer2.getType(), "Knight");
    }
}

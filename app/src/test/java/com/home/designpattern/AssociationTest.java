package com.home.designpattern;

import com.home.designpattern.designpatterns.Observer.Adventurer;
import com.home.designpattern.designpatterns.Observer.Association;
import com.home.designpattern.designpatterns.Observer.Bard;
import com.home.designpattern.designpatterns.Observer.Gunman;
import com.home.designpattern.designpatterns.Observer.Lancer;
import com.home.designpattern.designpatterns.Observer.Subject;

import org.junit.Test;

/**
 * 觀察者模式-測試
 */
public class AssociationTest {
    @Test
    public void test() {
        System.out.println("==========觀察者模式測試==========");

        // 冒險者們
        Adventurer lancer = new Lancer("jacky");
        Adventurer lancer2 = new Lancer("seven");
        Adventurer bard = new Bard("lee");
        Adventurer gunman = new Gunman("longWu");

        // 冒險者協會
        Subject association = new Association();
        association.add(lancer);
        association.add(lancer2);
        association.add(bard);
        association.add(gunman);

        System.out.println("---派送簡單任務---");
        association.sendQuestions("run");

        System.out.println("---派送複雜任務---");
        association.sendQuestions("run run run, run for your life.");

        // seven表示不想接到任務通知了
        association.remove(lancer2);
        System.out.println();
        System.out.println("---派送複雜任務(seven已經不在名單中)---");
        association.sendQuestions("run run run, run for your life");
    }
}

package com.home.designpattern.Decorator;

import com.home.designpattern.designpatterns.Decorator.Adventurer;
import com.home.designpattern.designpatterns.Decorator.Lancer;
import com.home.designpattern.designpatterns.Decorator.Title;
import com.home.designpattern.designpatterns.Decorator.TitleAgile;
import com.home.designpattern.designpatterns.Decorator.TitleFire;
import com.home.designpattern.designpatterns.Decorator.TitleStrong;

import org.junit.Test;

/**
 * 裝飾者模式-測試
 */
public class TitleTest {

    @Test
    public void test() {
        System.out.println("==========裝飾者模式測試==========");

        // 一開始沒有任何稱號的冒險者
        Adventurer lancer = new Lancer("Poman");
        System.out.println("---長槍兵Poman---");
        lancer.attack();

        System.out.println();
        System.out.println("---取得強壯稱號的Poman---");
        TitleStrong sPoman = new TitleStrong(lancer);
        sPoman.attack();

        System.out.println();
        System.out.println("---取得敏捷稱號的Poman---");
        Title aPoman = new TitleAgile(sPoman);
        aPoman.attack();
        ((TitleAgile) aPoman).useFlash();

        System.out.println();
        System.out.println("---取得燃燒稱號的Poman---");
        Title fPoman = new TitleFire(aPoman);
        fPoman.attack();
        ((TitleFire) fPoman).fireBall();

        System.out.println();
        System.out.println("---Poman獲得超強力稱號---");
        Title ssPoman = new TitleStrong(fPoman);
        ssPoman.attack();
    }
}

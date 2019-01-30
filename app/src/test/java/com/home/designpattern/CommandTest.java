package com.home.designpattern;

import com.home.designpattern.designpatterns.Command.BarKeep;
import com.home.designpattern.designpatterns.Command.Chef;
import com.home.designpattern.designpatterns.Command.DrinkOrder;
import com.home.designpattern.designpatterns.Command.Order;
import com.home.designpattern.designpatterns.Command.SnackOrder;
import com.home.designpattern.designpatterns.Command.Waitress;

import org.junit.Test;

/**
 * 命令模式-測試
 */
public class CommandTest {
    @Test
    public void test() {
        System.out.println("==========命令模式測試==========");

        // 開店準備
        Chef chef = new Chef();
        BarKeep barKeep = new BarKeep();
        Order snackOrder = new SnackOrder(chef);
        Order drinkOrder = new DrinkOrder(barKeep);

        Waitress cuteGirl = new Waitress();
        System.out.println("---客人點餐---");

        // 開始營業，客人點餐
        cuteGirl.setOrder(snackOrder);
        cuteGirl.setOrder(snackOrder);
        cuteGirl.setOrder(drinkOrder);
        cuteGirl.setOrder(drinkOrder);

        // 飲料還沒賣完
        cuteGirl.setOrder(drinkOrder);
        System.out.println("---客人取消點心---");
        // 取消一個點心
        cuteGirl.cancelOrder(snackOrder);
        // 點心又可以賣一個
        cuteGirl.setOrder(snackOrder);
        System.out.println("===點餐完成，送到後面廚房通知廚師與搖飲料小弟===");
        cuteGirl.notifyBaker();
        System.out.println();
        System.out.println("====點心庫存不足測試====");
        // 點心賣完了
        cuteGirl.setOrder(snackOrder);
    }
}

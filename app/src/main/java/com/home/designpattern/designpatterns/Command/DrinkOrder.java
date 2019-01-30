package com.home.designpattern.designpatterns.Command;

/**
 *  飲料訂單(Concrete Command)
 */
public class DrinkOrder extends Order {
    public DrinkOrder(KitchenWorker receiver) {
        super(receiver);
        super.name = "drinkOrder";
    }
}

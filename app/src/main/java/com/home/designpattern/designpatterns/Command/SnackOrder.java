package com.home.designpattern.designpatterns.Command;

/**
 *  點心訂單(Concrete Command)
 */
public class SnackOrder extends Order {
    public SnackOrder(KitchenWorker receiver) {
        super(receiver);
        super.name = "snackOrder";
    }
}

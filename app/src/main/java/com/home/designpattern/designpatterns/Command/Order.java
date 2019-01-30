package com.home.designpattern.designpatterns.Command;

/**
 *  訂單(Command)
 */
public abstract class Order {
    // 廚房工作者(Receiver)
    protected KitchenWorker receiver;
    protected String name;

    public Order(KitchenWorker receiver) {
        this.receiver = receiver;
    }

    // 將訂單送給廚房人員
    public void sendOrder() {
        receiver.finishOrder();
    }

    // 讓其他程式知道這是甚麼訂單
    public String getName() {
        return this.name;
    }
}

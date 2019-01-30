package com.home.designpattern.designpatterns.Command;

import java.util.ArrayList;
import java.util.List;

/**
 *  服務生(Invoker)
 */
public class Waitress {
    private int snackQty = 2; // 點心剩餘的數量
    private int drinkQty = 4; // 飲料剩餘的杯數
    private List<Order> orders = new ArrayList<>();

    /**
         *  服務生接收訂單
         * @param order
         */
    public void setOrder(Order order) {

        if (order.name.equals("snackOrder")) {
            if (snackQty <= 0) {
                System.out.println("點心賣完了");
            } else {
                System.out.println("增加點心訂單");
                snackQty--;
                orders.add(order);
            }
        }

        if (order.name.equals("drinkOrder")) {
            if (drinkQty <= 0) {
                System.out.println("飲料賣完了");
            } else {
                System.out.println("增加飲料訂單");
                drinkQty--;
                orders.add(order);
            }
        }
    }

    /**
        *   取消訂單
        * @param order
        */
    public void cancelOrder(Order order) {
        if (order.name.equals("snackOrder")) {
            snackQty++;
            System.out.println("取消一份點心");
        }
        if (order.name.equals("drinkOrder")) {
            drinkQty++;
            System.out.println("取消一杯飲料");
        }
        orders.remove(order);
    }

    /**
         *  將訂單送到廚房
         */
    public void notifyBaker() {
        for (Order order : orders) {
            order.sendOrder();
        }
        orders.clear();
    }
}

package com.home.designpattern.designpatterns.Observer;

/**
 * 槍手(Concrete Observer)-繼承冒險者
 */
public class Gunman extends Adventurer {
    public Gunman(String name) {
        super(name);
    }

    @Override
    public void getQuestions(String questions) {
        if (questions.length() < 10) {
            System.out.println(":任務太簡單了，來一點難的吧!");
        } else {
            System.out.println(":槍在人在，槍亡人亡，來去賺錢去!");
        }
    }
}

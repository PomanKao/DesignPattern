package com.home.designpattern.designpatterns.Observer;

/**
 *  槍兵(Concrete Observer)-繼承冒險者
 */
public class Lancer extends Adventurer {
    public Lancer(String name) {
        super(name);
    }

    @Override
    public void getQuestions(String questions) {
        System.out.println(":不管幾個任務，我都可以接受!");
    }
}

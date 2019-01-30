package com.home.designpattern.designpatterns.Observer;

/**
 *  吟遊詩人(Concrete Observer)-繼承冒險者
 */
public class Bard extends Adventurer {

    public Bard(String name) {
        super(name);
    }

    @Override
    public void getQuestions(String questions) {
        if (questions.length() > 10) {
            System.out.println(":任務太難了，我只會唱歌跳舞，不接不接!");
        } else {
            System.out.println(":當街頭藝人太難賺了，偶爾也要接個任務賺錢。");
        }
    }
}

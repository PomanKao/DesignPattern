package com.home.designpattern.designpatterns.Observer;

public class Association extends Subject {
    @Override
    public void sendQuestions(String questions) {
        for (Adventurer adventurer : list) {
            adventurer.getQuestions(questions);
        }
    }
}

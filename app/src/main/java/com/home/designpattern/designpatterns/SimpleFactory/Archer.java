package com.home.designpattern.designpatterns.SimpleFactory;

public class Archer implements Adventurer {
    @Override
    public String getType() {
        System.out.println("我是弓箭手!射好射滿:)");
        return this.getClass().getSimpleName();
    }
}

package com.home.designpattern.designpatterns.Decorator;

/**
 * 稱號介面(Decorator)
 */
public abstract class Title implements Adventurer {
    /**
     * 被裝飾的冒險者(Component)
     */
    protected Adventurer adventurer;

    public Title(Adventurer adventurer) {
        this.adventurer = adventurer;
    }

    @Override
    public void attack() {
        adventurer.attack();
    }
}

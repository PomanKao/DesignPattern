package com.home.designpattern.designpatterns;

public class Singleton {
    private static Singleton getInstance;

    private Singleton() {
        // 通常建構子會建置很多物件，需要花很多時間
    }

    // 因為constructor是private，因此需要另外提供一個方法，讓其他程式調用這個類別
    public static Singleton getInstance() {
        // 當第一次調用時，才會建立物件，之後都使用同一個物件
        if (getInstance == null) {
            getInstance = new Singleton();
        }
        return getInstance;
    }

    // 多執行緒時，使用synchronized保證Singleton一定是單一的
    public static synchronized Singleton getInstanceSynchronized() {
        if (getInstance == null) {
            getInstance = new Singleton();
        }
        return getInstance;
    }

    // 多執行緒時，當物件需要被建立時，才使用synchronized，也保證Singleton一定單一的，且增加程式效能
    public static Singleton getInstanceSynchronizedP() {
        synchronized (Singleton.class) {
            if (getInstance == null) {
                getInstance = new Singleton();
            }
        }
        return getInstance;
    }
}

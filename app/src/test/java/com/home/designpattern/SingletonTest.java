package com.home.designpattern;

import com.home.designpattern.designpatterns.Singleton;

import org.junit.Test;

public class SingletonTest {

    private class InstanceThread extends Thread {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            String name = Thread.currentThread().getName();
            if (singleton != null) {
                System.out.println(name + " run: 產生Singleton: " + singleton.hashCode() + "\t" +System.currentTimeMillis());
            }
        }
    }

    private class InstanceSynThread extends Thread {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstanceSynchronized();
            String name = Thread.currentThread().getName();
            if (singleton != null) {
                System.out.println(name + " run: 產生Singleton: " + singleton.hashCode() + "\t" +System.currentTimeMillis());
            } else {
                System.out.println(InstanceSynThread.class.getSimpleName() + ": singleton == null");
            }
        }
    }

    private class InstanceSynPerfThread extends Thread {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstanceSynchronizedP();
            String name = Thread.currentThread().getName();
            if (singleton != null) {
                System.out.println(name + " run: 產生Singleton: " + singleton.hashCode() + "\t" +System.currentTimeMillis());
            } else {
                System.out.println(InstanceSynPerfThread.class.getSimpleName() + ": singleton == null");
            }
        }
    }

    @Test
    public void test() {
        /*
        // 單執行緒時，確實是同一個物件
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("test: \ns1: " + s1.hashCode() + "\ns2: " + s2.hashCode());
        */

        /*// 兩個執行緒同時執行，產生不同的物件
        Thread t1 = new InstanceThread();
        Thread t2 = new InstanceThread();
        t1.start();
        t2.start();*/

        /*// 因此需要用synchronized，使得兩個物件務必是相同
        Thread t1 = new InstanceSynThread();
        Thread t2 = new InstanceSynThread();
        t1.start();
        t2.start();*/

        // 另一種synchronized，是創建的建構子的時候，才用synchronized，網路說法是效能較佳
        Thread t1 = new InstanceSynPerfThread();
        Thread t2 = new InstanceSynPerfThread();
        t1.start();
        t2.start();
    }
}

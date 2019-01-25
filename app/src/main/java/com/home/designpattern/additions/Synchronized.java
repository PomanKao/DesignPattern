package com.home.designpattern.additions;

import android.util.Log;

import static android.content.ContentValues.TAG;

public class Synchronized {

    public Synchronized() {
        final PrintLoop p1 = new PrintLoop();

        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
//                synchronized (p1) {
                    Log.d(TAG, threadName + "run: 同步開始");
                    p1.print(threadName, 5);
                    Log.d(TAG, threadName + "run: 同步結束");
//                }
            }
        };

        Thread t2 = new Thread("t2") {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
//                synchronized (p1) {
                    Log.d(TAG, threadName + "run: 同步開始");
                    p1.print(threadName, 5);
                    Log.d(TAG, threadName + "run: 同步結束");
//                }
            }
        };

        t1.start();
        t2.start();
    }

    private class PrintLoop {
        private void print(String threadName, int times) {
            Log.d(TAG, threadName + "print 開始!");
            for (int i =0; i < times; i++) {
                Log.d(TAG, threadName + ":" + i);
            }
            Log.d(TAG, threadName + "print 結束!");
        }
    }
}

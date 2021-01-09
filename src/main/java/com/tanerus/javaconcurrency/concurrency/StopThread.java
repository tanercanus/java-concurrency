package com.tanerus.javaconcurrency.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * @author tanerus
 * @version 1.0
 * @date 3.1.2021 22:32
 */
public class StopThread {
    private static volatile boolean stop;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            public void run() {
                while(!stop) { System.out.println("In while ..."); }
            }
        }).start();

        TimeUnit.SECONDS.sleep(1);
        stop = true;
    }
}

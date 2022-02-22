package com.anzhi.threadpool;

import java.util.concurrent.ThreadPoolExecutor;

public class ThreadTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

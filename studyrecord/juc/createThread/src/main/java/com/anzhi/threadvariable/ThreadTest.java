package com.anzhi.threadvariable;

public class ThreadTest {
    public static void main(String[] args) {
        // 设置 A 线程 count
        ThreadVariable varT1 = new ThreadVariable();
        varT1.setCount(10);
        Thread t1 = new Thread(varT1);
        t1.setName("A");
        t1.start();

        ThreadVariable varT2 = new ThreadVariable();
        varT2.setCount(10);
        Thread t2 = new Thread(varT2);
        t2.setName("B");
        t2.start();

        ThreadVariable varT3 = new ThreadVariable();
        varT3.setCount(10);
        Thread t3 = new Thread(varT3);
        t3.setName("C");
        t3.start();
    }
}

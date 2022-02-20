package com.anzhi.threadcreate;

public class ThreadTest {
    public static void main(String[] args) {
        CreateThreadByExtendsThread t = new CreateThreadByExtendsThread();
        t.setName("CreateThreadByExtendsThread"); // 指定线程执行名称
        t.start();  // 耗时较长
        System.out.println("当前线程" + Thread.currentThread().getName() + "执行结束\n" + "当前线程" + t.getName() + "执行结束"); //主线程耗时较短
    }
}

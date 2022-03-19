package com.anzhi.threadmethod;

public class ThreadMethod {
    public static void main(String[] args) {
//        CurrentThreadMethod currentThreadMethod = new CurrentThreadMethod();
//        Thread t = new Thread(currentThreadMethod);
//        t.setName("执行线程A");
//        t.start();
//        t.run();
//
//        ThreadisAliveMethod threadisAliveMethod = new ThreadisAliveMethod();
//        System.out.println("threadisAliveMethod 线程状态 start ：" + threadisAliveMethod.isAlive());
//        threadisAliveMethod.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            //doNothing
//        }
//        System.out.println("threadisAliveMethod 线程状态 end：" + threadisAliveMethod.isAlive());

        ThreadisAliveMethod aliveMethod = new ThreadisAliveMethod();
        Thread t2 = new Thread(aliveMethod);
        System.out.println("t2 线程状态 start ：" + t2.isAlive());
        t2.setName("aliveThread");
        t2.start();
        System.out.println("t2 线程状态 end：" + t2.isAlive());
    }
}

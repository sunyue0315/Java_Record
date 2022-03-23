package com.anzhi.daemonthread;

public class DaemonThreadMethodTest extends Thread{
    public static void main(String[] args) {
        try{
            DaemonThreadMethod threadMethod = new DaemonThreadMethod();
            threadMethod.setDaemon(true);
            threadMethod.start();
            Thread.sleep(5000);
            System.out.println("我离开 thread 对象也不再打印了，也就是停止了");
        }catch (InterruptedException e){

        }
    }
}

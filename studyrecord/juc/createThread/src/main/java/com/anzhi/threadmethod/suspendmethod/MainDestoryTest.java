package com.anzhi.threadmethod.suspendmethod;

public class MainDestoryTest {
    public static void main(String[] args) {
        try{
            MainDestory th = new MainDestory();
            Thread.sleep(1000);
            th.start();
            th.suspend();
            System.out.println("main end");
        }catch (InterruptedException e){
            // doNothing
        }
    }
}

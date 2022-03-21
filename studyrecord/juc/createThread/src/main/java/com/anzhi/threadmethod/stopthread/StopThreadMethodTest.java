package com.anzhi.threadmethod.stopthread;

public class StopThreadMethodTest {
    public static void main(String[] args) {
        try {
            StopThreadMethod stopThread = new StopThreadMethod();
            stopThread.start();
            Thread.sleep(800);
            stopThread.stop();
        }catch (InterruptedException e){

        }
    }
}

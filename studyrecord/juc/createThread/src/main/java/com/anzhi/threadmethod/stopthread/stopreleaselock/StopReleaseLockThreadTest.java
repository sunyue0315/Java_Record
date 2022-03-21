package com.anzhi.threadmethod.stopthread.stopreleaselock;

public class StopReleaseLockThreadTest {
    public static void main(String[] args) {
        StopReleaseLockService stopReleaseLockService = new StopReleaseLockService();
        StopReleaseLockThreadA threadA = new StopReleaseLockThreadA(stopReleaseLockService);
        threadA.start();
        try {
            Thread.sleep(100);
            StopReleaseLockThreadB stopReleaseLockThreadB = new StopReleaseLockThreadB(stopReleaseLockService);
            StopReleaseLockThreadB threadB = new StopReleaseLockThreadB(stopReleaseLockService);
            threadB.start();
            Thread.sleep(3000);
            threadA.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

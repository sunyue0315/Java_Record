package com.anzhi.threadvariable;

public class ThreadVariableShare implements Runnable{

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        count--;
        while (count > 0){
            System.out.println("由" + Thread.currentThread().getName() + "计算， count=" + count);
        }
    }
}

package com.anzhi.threadvariable;

public class ThreadVariableNotShare implements Runnable{

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (count > 0){
            count--;
            System.out.println("由" + Thread.currentThread().getName() + "计算， count=" + count);
        }
    }
}

package com.anzhi.threadvariable;

public class ThreadTest {
    public static void main(String[] args) {
        // 线程变量不共享
        System.out.println("=======================线程变量不共享 start=====================");
        ThreadVariableNotShare varT1 = new ThreadVariableNotShare();
        varT1.setCount(10);
        Thread t1 = new Thread(varT1);
        t1.setName("varT1");
        t1.start();

        ThreadVariableNotShare varT2 = new ThreadVariableNotShare();
        varT2.setCount(10);
        Thread t2 = new Thread(varT2);
        t2.setName("varT2");
        t2.start();

        ThreadVariableNotShare varT3 = new ThreadVariableNotShare();
        varT3.setCount(10);
        Thread t3 = new Thread(varT3);
        t3.setName("varT3");
        t3.start();
        System.out.println("=======================线程变量不共享 end=====================");


        // 线程共享
        System.out.println("=======================线程变量共享 start=====================");
        ThreadVariableShare varT4 = new ThreadVariableShare();
        varT4.setCount(10);
        Thread t4 = new Thread(varT1);
        t4.setName("varT4");
        t4.start();

        ThreadVariableShare varT5 = new ThreadVariableShare();
        varT5.setCount(10);
        Thread t5 = new Thread(varT2);
        t5.setName("varT5");
        t5.start();

        ThreadVariableShare varT6 = new ThreadVariableShare();
        varT3.setCount(10);
        Thread t6 = new Thread(varT3);
        t6.setName("varT6");
        t6.start();
        System.out.println("=======================线程变量共享 end=====================");


    }
}

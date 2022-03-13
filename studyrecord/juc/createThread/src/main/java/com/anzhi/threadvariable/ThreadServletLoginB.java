package com.anzhi.threadvariable;

public class ThreadServletLoginB extends Thread{
    @Override
    public void run() {
        ThreadServletLogin.doPost("b", "Loginb");
    }
}

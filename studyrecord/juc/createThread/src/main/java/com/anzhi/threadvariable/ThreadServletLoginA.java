package com.anzhi.threadvariable;

public class ThreadServletLoginA  extends Thread{
    @Override
    public void run() {
        ThreadServletLogin.doPost("a", "LoginA");
    }
}

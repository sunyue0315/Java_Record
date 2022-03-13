package com.anzhi.threadvariable;

public class ThreadServletLoginTest {
    public static void main(String[] args) {
        ThreadServletLoginA aLogin = new ThreadServletLoginA();
        aLogin.start();
        ThreadServletLoginB bLogin = new ThreadServletLoginB();
        bLogin.start();
    }
}

package com.anzhi.threadvariable;

/**
 * 模拟一个 servlet 登陆组件
 */
public class ThreadServletLogin {
    private static String usernameRef;
    private static String passwordRef;

    public static void doPost(String username, String password){
        usernameRef = username;
        if(username.equals("a")){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        passwordRef = password;
        System.out.println("username= " + usernameRef + " password= " + passwordRef);
    }
}

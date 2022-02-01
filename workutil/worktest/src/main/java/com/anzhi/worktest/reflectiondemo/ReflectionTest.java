package com.anzhi.worktest.reflectiondemo;

import sun.applet.Main;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {

    // 验证 -parameters 参数的作用
    public static void main(String[] args) {
        Method[] methods = ReflectionTest.class.getMethods();
        for (Method method : methods){
            if("parameterMethodTest".equals(method.getName())){
                Parameter[] parameters = method.getParameters();
                for(Parameter parameter : parameters){
                    System.out.println(parameter.getName());
                }
            }
        }
    }

    public static void parameterMethodTest(int paramOne, String paramTwo, int paramThird){
        System.out.println("test parameters");
    }
}

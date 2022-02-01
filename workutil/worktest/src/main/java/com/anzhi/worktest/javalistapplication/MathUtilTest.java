package com.anzhi.worktest.javalistapplication;

import java.util.HashMap;
import java.util.Map;

/**
 * @Package: com.anzhi.worktest.javalistapplication
 * @ClassName: MathUtilTest
 * @Author: AZ
 * @CreateTime: 2021/11/15 10:52
 * @Description:
 */
public class MathUtilTest {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        classA.setStock(classB.getStock());

        System.out.println(classA.getStock());

        Map<String, Integer> map = new HashMap<>();

        map.put("1", null);

        System.out.println(map.get("1"));
    }
}

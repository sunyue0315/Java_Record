package com.anzhi.worktest.javalistapplication;




import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Package: com.anzhi.worktest.javalistapplication
 * @ClassName: JavaListApplication
 * @Author: AZ
 * @CreateTime: 2021/9/24 22:49
 * @Description:
 */
public class JavaListApplication {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        // 求差集:求List1中有的但是List2中没有的元素
        //subTract(list1, list2);

        // 求并集(不去重)---将一个集合全部加入另一个集合
        //merge(list1,list2);

        //求并集(去重)求List1和List2的并集,并实现去重。
        mergeDisTinct(list1,list2);

        // 求交集：求List1和List2中都有的元素
        //intersect(list1,list2);

        System.out.println("---------------------对象属性集合运算-------------------------");
        List<ClassA> aList = new ArrayList<>(Arrays.asList(
                new ClassA("1", "张三"),
                new ClassA("2", "李四"),
                new ClassA("3", "王五")
        ));

        List<ClassB> bList = new ArrayList<>(Arrays.asList(
                new ClassB("2", "李某"),
                new ClassB("3", "王某"),
                new ClassB("4", "王某"),
                new ClassB("5", "王某")
//                new ClassB("4", "赵某")
        ));

        //aList与bList的交集
        List<ClassA> intersectA = aList
                .stream() //获取第一个集合的Stream1
                .filter(  //取出Stream1中符合条件的元素组成新的Stream2，lambda表达式1返回值为true时为符合条件
                        a ->  //lambda表达式1，a为lambda表达式1的参数，是Stream1中的每个元素
                                bList.stream() //获取第二个集合的Stream3
                                        .map(ClassB::getId) //将第二个集合每个元素的id属性取出来，映射成新的一个Stream4
                                        .anyMatch( //返回值（boolean）：Stream4中是否至少有一个元素使lambda表达式2返回值为true
                                                id -> //lambda表达式2，id为lambda表达式2的参数，是Stream4中的每个元素
                                                        Objects.equals(a.getId(), id) //判断id的值是否相等
                                        )
                )
                .collect(Collectors.toList()); //将Stream2转换为List
        System.out.println(intersectA);
        System.out.println("------------------------------------------");

        //bList与aList的差集
        List<ClassB> differenceB = bList.stream()
                .filter(b -> aList.stream().map(ClassA::getId)
                .noneMatch(id -> Objects.equals(b.getId(), id)))
                .collect(Collectors.toList());
        System.out.println(bList);

        ClassA classA = new ClassA("123", "张三");
        ClassA classA1 = new ClassA("12", "张三");

        boolean b = ObjectUtils.notEqual(classA, classA1);
        System.out.println("比较对象属性"+b);

    }

    public static void subTract(List<String> list1, List<String> list2){
        list1.removeAll(list2);
        System.out.println("list1与list2的差集为："+ list1);
        System.out.println("------------------------------------");
    }

    public static  void merge(List<String> list1, List<String> list2){
        list1.addAll(list2);
        System.out.println("list1与list2的并集不去重为："+list1);
        System.out.println("------------------------------------");
    }

    public static  void mergeDisTinct(List<String> list1, List<String> list2){
        list1.removeAll(list2);
        list1.addAll(list2);
        System.out.println("list1与list2的并集去重为："+list1);
        System.out.println("------------------------------------");
    }

    public static  void intersect(List<String> list1, List<String> list2){
        list1.retainAll(list2);
        System.out.println("list1与list2的交集为："+list1);
        System.out.println("------------------------------------");
    }

}

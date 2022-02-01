package com.anzhi.worktest.javalistapplication;

/**
 * @Package: com.anzhi.worktest.javalistapplication
 * @ClassName: ClassB
 * @Author: AZ
 * @CreateTime: 2021/9/25 0:16
 * @Description:
 */
class ClassB {
    String id;
    String nickName;
    Integer stock;

    public ClassB (){}

    public ClassB(String id, String nickName) {
        this.id = id;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "id='" + id + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public Integer getStock(){
        return stock;
    }
}

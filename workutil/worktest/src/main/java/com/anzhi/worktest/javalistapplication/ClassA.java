package com.anzhi.worktest.javalistapplication;

/**
 * @Package: com.anzhi.worktest.javalistapplication
 * @ClassName: ClassA
 * @Author: AZ
 * @CreateTime: 2021/9/25 0:15
 * @Description:
 */
public class ClassA {
    String id;
    String realName;

    private Integer stock;
    private Integer stockA;

    public ClassA (){}

    public ClassA(String id, String realName) {
        this.id = id;
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "id='" + id + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getRealName() {
        return realName;
    }

    public Integer getStock(){
        return stock;
    }

    public Integer getStockA(){
        return stockA;
    }

    public void setStock(Integer stock){
        this.stock = stock;
    }

    public void setStockA(Integer stockA){
        this.stockA = stockA;
    }

}

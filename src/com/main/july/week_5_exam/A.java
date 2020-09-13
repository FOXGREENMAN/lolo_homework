package com.main.july.week_5_exam;

public class A {
    //创建静态对象
    private  static  A  asd= new A();

    //私有构造函数: 防止其他类new这个对象
    private  A(){}

    //提供一个方法给外部调用获取对象
    public  static  A getAsd(){
        return asd;
    }
}

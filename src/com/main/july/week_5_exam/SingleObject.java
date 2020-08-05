package com.main.july.week_5_exam;

public class SingleObject {
    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();
    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}

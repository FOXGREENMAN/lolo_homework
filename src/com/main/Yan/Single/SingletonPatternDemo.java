package com.main.Yan.Single;

import java.util.ArrayList;
import java.util.List;

public class SingletonPatternDemo {
    public static void main(String[] args) {
       showSingle();


    }

    public static void showSingle(){
        // 这个对象部是单例的
        NotSingle notSingle = new NotSingle();
        List<String> list = new ArrayList<>();
        int[] arr = new int[2];
        System.out.println(notSingle); // 没有重写toString方法, 所以打印的是内存地址
        System.out.println(list); // 重写了同String方法, 所以打印的是自定义的内容
    }

    public static void demo(){
        // 不合法的构造函数
        // 编译时错误：构造函数 SingleObject() 是不可见的
        // SingleObject object = new SingleObject();

        // 获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        // 显示消息
        object.showMessage();
    }



}

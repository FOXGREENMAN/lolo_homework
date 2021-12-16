package com.november19;

public class InitializeDemo {
    //（静态变量、静态初始化块）>（变量、初始化块）>构造器
    //1.静态块：用static声明，JVM加载类时执行，仅执行一次
    // 2.构造块：类中直接用{}定义，每次创建对象时执行
    // 3.执行顺序优先级：静态块>main()>构造块>构造方法
    // 4.静态块和静态属性优先执行，谁在前先执行谁

    //静态变量
    public static String str = "1.静态变量";
    //变量
    public String strs = "2.变量";
    //初始化块
    {
        System.out.println(strs);
        System.out.println("2.初始化块");
    }

    //构造
    InitializeDemo(){
        System.out.println("3构造");
    }

    //静态代码块
    static {
        System.out.println("1.静态初始化块");
        System.out.println(str);
    }

    public static void main(String[] args) {
        new InitializeDemo();
    }

}

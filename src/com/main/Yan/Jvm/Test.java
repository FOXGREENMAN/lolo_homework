package com.main.Yan.Jvm;

public class Test {
    public static void swap(int i){
        i = 6;
        System.out.println("方法中的参数i的值:"+ i);
    }
    public static void main(String[] args) {
      int a = 0;
      swap(a);
        System.out.println("main方法中的a的值: "+a);
    }
}

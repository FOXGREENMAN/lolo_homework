package com.november12.single;

public class SingleDemo {


    public static void main(String[] args) {
        Lazy lazy = Lazy.getLazy();
        Lazy lazy1 = Lazy.getLazy();
        System.out.println(lazy);
        System.out.println(lazy1);
    }
}

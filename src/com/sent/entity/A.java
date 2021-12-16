package com.sent.entity;

public class A {
    private String str;
    private Integer integer;
    static String qwe;

    {
        System.out.println("1");
    }

    public A(String str, Integer integer, String qwe) {
        this.str = str;
        this.integer = integer;
        this.qwe = qwe;
    }
    

    // A aBean = new A();
}

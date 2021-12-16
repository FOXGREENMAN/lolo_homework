package com.rewrite;

public class RewriteText {
    public static void main(String[] args) {
        Father a = new Father();
        Father b = new Son();

        a.A();
        a.B();
        a.C("测试C");

        b.A();
        b.B();
        b.C("TE测试C");
    }
}

package com.november24.staticPackage;

public class Demo {
    public static void main(String[] args) {
        SpiderSuit spiderSuit = new SpiderMan();
        Karen karen = new Karen(spiderSuit);
        karen.shot();
        karen.fly();

    }
}

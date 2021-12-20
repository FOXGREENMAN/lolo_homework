package com.november24.dynamicPackage;

import java.lang.reflect.Proxy;

public class HeLanDi {
    public static void main(String[] args) {
        SpiderSuit spiderSuit = new SpiderMan();
        SpiderSuit spiderSuitNew = (SpiderSuit) Proxy.newProxyInstance(
                SpiderSuit.class.getClassLoader(),
                new Class[]{SpiderSuit.class},
                new Karen(spiderSuit)
        );
        System.out.println("1");
        spiderSuitNew.shot();
        spiderSuitNew.fly();
        spiderSuitNew.run();


    }
}

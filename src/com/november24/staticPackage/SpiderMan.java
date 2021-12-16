package com.november24.staticPackage;

public class SpiderMan implements SpiderSuit{
    public void shot(){
        System.out.println("发射蜘蛛网");
    }

    @Override
    public void fly() {
        System.out.println("蛛网滑翔");
    }
}

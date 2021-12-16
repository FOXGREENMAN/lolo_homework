package com.november24.staticPackage;

public class Karen implements SpiderSuit{
    private SpiderSuit spiderSuit;
    Karen(SpiderSuit spiderSuit){
        this.spiderSuit = spiderSuit;
    }
    Karen(){}
    public void shot(){
        spiderSuit.shot();
        System.out.println("投掷蛛网手雷");
    }

    @Override
    public void fly() {
        System.out.println("蛛网超级滑翔");
    }
}


package com.november12.single;

public class Hungry {
    private Hungry(){}

    static Hungry hungry = new Hungry();

    public static Hungry getHungry(){
        return hungry;
    }

}

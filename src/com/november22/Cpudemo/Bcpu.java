package com.november22.Cpudemo;

public class Bcpu extends Thread{
    Integer integer = 0;
    Bcpu(Integer integer){
        this.integer = integer;
    }
    public Integer getInteger(){
        return integer;
    }
    @Override
    public void run() {
        try {
            sleep((int) Math.random() * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        integer++;
        super.run();
    }
}

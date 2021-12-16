package com.november22.Cpudemo;

public class Acpu extends Thread{
    Integer integer = 0;
    Acpu(Integer integer){
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

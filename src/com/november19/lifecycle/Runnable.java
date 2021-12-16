package com.november19.lifecycle;

public class Runnable extends Thread{
    //准备就系
    public static void main(String[] args){
        Thread thread = new Thread();
        thread.start();
        System.out.println("[ " + thread.getName() + " ] 的状态是：" + thread.getState());
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

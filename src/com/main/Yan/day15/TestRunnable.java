package com.main.Yan.day15;

public class TestRunnable implements Runnable {

    @Override
    public void  run(){
        System.out.println(Thread.currentThread().getName()+"Runnable多线程运行代码");
        for (int i= 0; i<5; i++){
            System.out.println("这里是Runnable多线程的逻辑代码"+i);
        }
    }
}

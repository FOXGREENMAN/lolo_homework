package com.main.Yan.day15;

public class TestThread extends Thread {

    public void run(){

        System.out.println("多线程运行的代码");
        for (int i = 0; i<5 ; i++){
            System.out.println("多线程的逻辑代码");
        }
    }
}

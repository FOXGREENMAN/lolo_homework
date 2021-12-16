package com.november19.lifecycle;

public class Blocked extends Thread{
    //阻塞
    public static void main(String[] args) {
        Thread thread = new Thread();
        Thread thread1 = new Thread();

        thread.start();
        thread1.start();

        System.out.println("[ " + thread.getName() + " ] 的状态是：" + thread.getState());
        System.out.println("[ " + thread1.getName() + " ] 的状态是：" + thread1.getState());
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

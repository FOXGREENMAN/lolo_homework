package com.main.Yan.day15;

public class Test {
    public static void main(String[] args) {
//        Thread thread = new TestThread();
////        thread.start();
//        Thread thread1 = new TestThread();
//        thread1.start();

//        Thread thread = new Thread(new TestRunnable());
//        thread.start();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread thread1 = new Thread("t-1");
        thread1.start();
        Thread thread2 = new Thread(new TestRunnable(),"c-1");
        thread1.start();
        System.out.println("---------------1");
        System.out.println("---------------2");
        System.out.println("---------------3");
    }
}

package com.november12;

public class ThreadText extends Thread{
    private int count = 10;

    @Override
    public void run() {
//        while (true) {
//            if (count > 0) {
//                System.out.println(Thread.currentThread().getName() + " 剩余个数 " + count);
//                count--;
////                try {
////                    Thread.sleep(30);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
//            } else {
//                break;
//            }
//        }
        for (int i = 0; i <= 10; i++) {
            if(count>0){
                System.out.println(Thread.currentThread().getName()+"--抢到红包：" + count--);
            }
        }
    }

    public static void main(String[] args) {
//        new ThreadText().start();
//        new ThreadText().start();
        ThreadText thread1 = new ThreadText();
        ThreadText thread2 = new ThreadText();
        ThreadText thread3 = new ThreadText();

        thread1.setName("小明");
        thread2.setName("小王");
        thread3.setName("小词");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

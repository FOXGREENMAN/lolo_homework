package com.november12;

public class ThreadTextWto implements Runnable {
    private int count = 10;

    @Override
    public void run() {
        while (true) {
            if (count > 0) {
                System.out.println(Thread.currentThread().getName() + " 剩余个数 " + count);
                count--;
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ThreadTextWto threadTextWto = new ThreadTextWto();
        new Thread(threadTextWto).start();
        new Thread(threadTextWto).start();
        new Thread(threadTextWto).start();
        new Thread(threadTextWto).start();
    }
}

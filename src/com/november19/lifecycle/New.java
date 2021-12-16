package com.november19.lifecycle;

public class New extends Thread{
    //新建
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread();
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

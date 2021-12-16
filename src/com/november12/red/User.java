package com.november12.red;

public class User implements Runnable {

    private RedPacket redPacket;
    public User(RedPacket redPacket) {
        this.redPacket = redPacket;
    }

    @Override
    public void run() {
        int money = redPacket.checkRed();
        if(money == 0) {
            System.out.println(Thread.currentThread().getName() + "手慢了");
        }else {
            System.out.println(Thread.currentThread().getName() + "抢到 " + money + "元");
        }

    }
}

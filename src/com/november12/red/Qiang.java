package com.november12.red;

public class Qiang {

    public static void main(String[] args) {
        RedPacket redPacket = new RedPacket(100,5);
        User user = new User(redPacket);
        for(int i=0;i<5;i++) {
            new Thread(user).start();
        }
        //100以内的随机数
        System.out.println();
    }
}

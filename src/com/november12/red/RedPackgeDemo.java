package com.november12.red;

public class RedPackgeDemo {
    private static Integer money = 100;

    public static void main(String[] args) {
        RedPackge redPackge = new RedPackge();
        for (int i = 0; i<5; i++){
            Thread thread = new Thread();
            Integer yuE = redPackge.getMoney(money);
            System.out.println(thread.getName()+"抢到了"+ (money-yuE));
            money = yuE;

        }

    }



}

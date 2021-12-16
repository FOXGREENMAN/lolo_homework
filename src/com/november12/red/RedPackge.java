package com.november12.red;

public class RedPackge extends Thread{
    public Integer getMoney(Integer money){
        System.out.println("当前红包"+money);
        Integer integer = money - 5;
        System.out.println("抢完后的余额 "+integer);
        return integer;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +"1");
    }
}

package com.november19.jiafa;

public class CanS extends Thread{
    public Integer jiaFa(Integer integer) {
        Integer i = integer+10;
        return i;
    }

    @Override
    public void run() {

        System.out.println(getName()+"打了断点");
        super.run();
    }
}

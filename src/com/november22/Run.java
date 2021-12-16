package com.november22;

import static java.lang.Thread.sleep;

public class Run {
    Integer count = 100;
    public void  tRun(){
        RedA redA = new RedA(count);
        redA.start();
        count = redA.getTotal();
        try {
            sleep((int) Math.random() * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RedB redB = new RedB(count);
        count = redB.getTotal();
        redB.start();
    }
}

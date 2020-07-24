package com.main.Yan.day7;

import java.security.Key;

public class Kids extends Mankind {
    int yearsoOld;

    public int getYearsoOld() {
        return yearsoOld;
    }

    public void setYearsoOld(int yearsoOld) {
        this.yearsoOld = yearsoOld;
    }

    public  void printage(){
        System.out.println(this.yearsoOld);
    }

    public static void  main(String[] args){
        Kids kids = new Kids();
        kids.setSex(0);
        kids.setSalary(100);

        kids.manOrworman();
        kids.employeed();
    }
}

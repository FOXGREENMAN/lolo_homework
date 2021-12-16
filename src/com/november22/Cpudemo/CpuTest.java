package com.november22.Cpudemo;

public class CpuTest {
    static Integer i = 0;

    public static void main(String[] args) {
        Acpu acpu = new Acpu(i);
        acpu.start();
        i = acpu.getInteger();
        Bcpu bcpu = new Bcpu(i);
        bcpu.start();
        i = bcpu.getInteger();
        System.out.println(i);
    }

}

package com.main.july.week_5_exam;

public class Main {
    public static void main(String[] args) {
        Test instance = Test.getInstance();
        Test instance1 = Test.getInstance();
        Test7 test7 = new Test7();
        Test7 test7_1 = new Test7();
        System.out.println(instance);
        System.out.println(instance1);
    }
}

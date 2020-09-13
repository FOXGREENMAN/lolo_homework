package com.main.july.week_5_exam;

public class Test {
    private  static  Test  one = new Test();

    //私有构造
    private  Test(){}

    public static Test getInstance() {
        return one;
    }
}

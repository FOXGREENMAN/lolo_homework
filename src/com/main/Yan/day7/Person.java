package com.main.Yan.day7;

import sun.security.krb5.internal.PAForUserEnc;

public class Person {
    int age;
    String name;
    int sex;

    public void showInfo(){
        System.out.println(this.sex);
        System.out.println(this.age);
        System.out.println(this.name);
    }

    public void setInfo(int age, String name, int sex){
        this.age = age;
        this.name=  name;
        this.sex = sex;
    }

}

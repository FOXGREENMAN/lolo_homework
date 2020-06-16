package com.main.june.oop.answer.entity;


import java.util.Date;

// 类名前面需要用public 修饰, 才能被其他包引用
public class Notice extends Articles {

    private Date validTime;

    public Notice(){

    }

    public Date getValidTime() {
        return validTime;
    }

    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }
}

package com.main.june.oop.answer.entity;

// 类名前面需要用public 修饰, 才能被其他包引用
public class EventNotification extends Articles {
 private Byte isRelease;

    public Byte getIsRelease() {
        return isRelease;
    }

    public void setIsRelease(Byte isRelease) {
        this.isRelease = isRelease;
    }
}

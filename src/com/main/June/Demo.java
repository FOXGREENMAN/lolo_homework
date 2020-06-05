package com.main.June;

import com.main.utils.DateUtils;

public class Demo {
    public static void main(String[] args) {
        User two = new User();
        String Page = "sdasdsad";
        two.setName(Page);

        // 这是调用工具类的获取日期方法
        // 这个代码没有做赋值和接收的操作
        DateUtils.getTodayShort();

        // 这是创建一个String, 名字为dateShortStr(标识符) 用它接收工具类里获取日期的方法的返回字符串;
        // 等号是赋值操作, 将DateUtils.getTodayShort()的返回结果赋值给dateShortStr
        // 另一种说法, 用了dateShortStr接收DateUtils.getTodayShort()方法的返回结果, 二者是一个意思;
        String dateShortStr = DateUtils.getTodayShort();

        // 将上面获取到的dateShortStr拼接到name属性后面, 形成新的字符串, 就是nickeName了


}

}

// 一个class是一个java文件, 不允许在一个java文件里写多个class

 class setNickeNameByName {// 题目里, setNickeNameByName是方法名字, 不是类名

    // 同理, 一个class中只有一个main方法, 这是程序的入口; 入口只有一个;
    public static void main(String[] args) {


    }
}
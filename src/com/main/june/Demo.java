package com.main.june;

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
        two.setName(dateShortStr);

        // 将上面获取到的dateShortStr拼接到name属性后面, 形成新的字符串, 就是nickeName了


    }// 这里的大括号结尾标志, 和方法名那一行的第一个字母保持对齐, 这是编码习惯, 要养成好习惯_(:3JZ)_


    // 每个方法也要对齐, 同理是编码习惯~
    // 题目里, 返回值是无, 所以这里不需要返回值;
    // TODO 正确写法: public void setNickeNameByName(String nickName) // 标识符使用有意义的名字,空格每次使用一个
    public  String setNickeNameByName(String one) {
        User user = new User();
        String dateShortStr = DateUtils.getTodayShort();
        // 这里不对, setName是给user的name属性赋值, 所以你这里把日期字符串赋值给name了
        user.setName(dateShortStr);

        String ioo = new String();

        // 所以这里接收的name已经不是原来的name了
        ioo = user.getName();
        // 这里创建了一个新的user对象, 为啥? 上面创建的那个user就没有使用了;
        User iop = new User();
        // 这里给新建的user对象, 名字iop赋值了nickname属性, 但赋值的内容是name,所以是不对的;
        iop.setNickeName(ioo);

        // 当你的返回值是void的时候, 就不用写return了
        return null;

    }

}


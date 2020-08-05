package com.main.july.week_5_exam.order_exam.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckParam {

    final static int price_day_max = 0;
    final  static int price_day_min = 0;

    public static boolean check(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]+(.[0-9]+)?");
        Matcher isNum = pattern.matcher(str);
        int i =Integer.parseInt(str); // 如果你传入的字符串是abc这种的话, 这里就报错了
        if (!isNum.matches()) {
            return false;
        }if (str.matches("-?[0-9]+.?[0-9]*")){
            return false;
        }if (i < price_day_max){
            return false;
        }if (i > price_day_min){
            return false;
        }
        return true;
    }
}

package com.main.july.week_5_exam.order_exam.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckParamByFox {
    final static int price_day_max = 12;
    final  static int price_day_min = 12;

    /**
     * 验证字符串是否符合校验规则
     * @param str
     * @return
     */
    public static boolean check(String str) {

        // 检查是否为数字
        if (!checkNum(str)) {
            return false;
        }
        // 把字符串转换成整数, 但注意了, 这个方法传入浮点数 比如 2.3 会报错
        int i =Integer.parseInt(str);

        // 检查是否为数字, 和checkNum重复了, 可以去掉
        if (!str.matches("-?[0-9]+.?[0-9]*")){
            return false;

        // 检查是否大于当日最高价
        }if (i < price_day_max){
            return false;

        // 检查是否小于当日最低价
        }if (i > price_day_min){
            return false;
        }
        return true;
    }

    /**
     * 验证字符串是否为数字
     *
     * 1.0  = true
     * 1    = true
     * -1.0 = true
     * 1c   = false
     * c    = false
     *
     * @param str
     * @return
     */
    public static boolean checkNum(String str){
        Pattern pattern = Pattern.compile("-?[0-9]+(.[0-9]+)?");
        Matcher isNum = pattern.matcher(str);

        return isNum.matches();
    }

    public static void main(String[] args) {
        System.out.println(check("a"));
    }
}

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
            System.out.println("检查非负数");
            return false;

        }
        // 把字符串转换成整数, 但注意了, 这个方法传入浮点数 比如 2.3 会报错
        int i =Integer.parseInt(str);
        // 检查是否为数字, 和checkNum重复了, 可以去掉
        if (!str.matches("-?[0-9]+.?[0-9]*")) {
            System.out.println("检查不为数字 为字母");
            return false;
        }
        System.out.println("检查负数字母通过");
        return true;
    }

    public static boolean eheck(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]+(.[0-9]+)?");
        Matcher isNum = pattern.matcher(str);
        int i = Integer.parseInt(str); // 如果你传入的字符串是abc这种的话, 这里就报错了
        // 检查是否大于当日最高价
        if (i < price_day_max) {
            System.out.println("大于当日最高价");
            return false;

            // 检查是否小于当日最低价
        }
        if (i > price_day_min) {
            System.out.println("小于当日最高价");
            return false;
        }
        System.out.println("检查通过");
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

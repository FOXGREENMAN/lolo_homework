package com.main.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 2020/7/24.
 */
public class NumUtils {
    /**
     * 字符串是否为数字
     * @return
     */
    public static boolean isNumber(String str){
        String reg = "^(-[1-9]\\d*)|([1-9]\\d*)$";
        Pattern pat = Pattern.compile(reg);
        Matcher mat=pat.matcher(str);
        return mat.find();
    }
}

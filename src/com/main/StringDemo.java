package com.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {
    public static void main(String[] args) {
        String str = "https://";
//        System.out.println(strIsUrl(str));
//        System.out.println("截取后面"+str.indexOf("."));
//        System.out.println("截取前面"+str.indexOf("//")+2);
//        String pattern = ".*http.*";
//        boolean isMatch = Pattern.matches(pattern, str);
//        System.out.println("罗志豪"+isMatch);
        if (str.contains("//")){
            String checkUrl =str.substring(str.indexOf("//")+2);
            System.out.println(checkUrl);
            System.out.println("我进方法里面了");
        }

    }

    public static boolean strIsUrl(String param){

        Matcher mat = Pattern.compile("[a-zA-z]+://[^\\s]*").matcher(param);
        return mat.matches();
    }
}

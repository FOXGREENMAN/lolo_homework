package com.main.Yan.Ychang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ExcepTest {
    public static void main(String[] args) {
//        try {
//            int a[] = new int[2];
//            System.out.println("Access element three :" + a[3]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception thrown  :" + e);
//        }
//        System.out.println("Out of the block");
//
//
//        Map<String,String> map = new HashMap<String, String>();
//
//        System.out.println(map.get("123123").equals("123213"));
        String str = "yanyanyanyanyanyan";
        //比较字符串
//        System.out.println(str.equals("1"));
        //字符串长度
//        System.out.println(str.length());
        //转换字符串的大写
//        System.out.println(str.toUpperCase());
        //转换字符串小写
//        System.out.println(str.toLowerCase());
        //去掉前后空格的
//        System.out.println(str.trim());
        //分隔符


        try {
            Map<String,String> map = new Hashtable<String, String>();
            map.get("sad").toString();
        }catch (Exception e){
            System.out.println(e);
        }

    }








}


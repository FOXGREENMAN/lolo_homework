package com.main.Yan.day811;

import com.main.july.week_5_exam.order_exam.entity.B;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

    }

    public  static void day(){

        Map<String,Integer> map = new Hashtable<String, Integer>();
        Map<Double,Long> map1 = new Hashtable<Double, Long>();
        Map<Byte,Short> map2 = new Hashtable<Byte, Short>();
        Map<Float,Character> map3 = new Hashtable<Float, Character>();
        Short s =123;
        Byte b = 1;
        map.put("123213",123);
        map1.put(123.213,213L);
        map2.put(b,s);





        Selout selout = new Selout();
        Map<Selout,Selout> map4 = new Hashtable<Selout,Selout>();
        Map<List<String>,String> map5 = new Hashtable<List<String>, String>();
        List<String> list = new ArrayList<String>();
        list.add("123213");
        map5.put(list,"123213");

        Map<Map<String,String>,Map<Integer,String>> map6 = new Hashtable<Map<String, String>, Map<Integer, String>>();
        Map<String,String> map7 = new Hashtable<String, String>();
        Map<Integer,String> map8 = new Hashtable<Integer, String>();
        map7.put("1231","123213");
        map8.put(213,"213213");
        map6.put(map7,map8);
    }
}

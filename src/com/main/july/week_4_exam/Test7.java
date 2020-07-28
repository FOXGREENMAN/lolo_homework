package com.main.july.week_4_exam;

import java.util.HashMap;
import java.util.Map;

public class Test7 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        sadsad(1,"n");
        sadsad(2,"d");
        sadsad(3,"q");
        sadsad(4,"v");

    }
    public static Map sadsad(int a, String b){
        Map<Integer,String> map = new HashMap<Integer, String>();

        map.put(a,b);
        map.get(1);
        System.out.println(map.get(4));

        return map;
    }
}

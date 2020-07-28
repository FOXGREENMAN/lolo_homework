package com.main.july.week_5_exam;

import java.util.HashMap;
import java.util.Map;

public class Test7 {
    public static void main(String[] args) {

       /* sadsad(1,"n");
        sadsad(2,"d");
        sadsad(3,"q");
        sadsad(4,"v");*/
       test('a');
        System.out.println((int)'a');

    }
    public static Map sadsad(int a, String b){

        Map<Integer,String> map = new HashMap<Integer, String>();

        map.put(a,b);
        map.get(1);
        System.out.println(map.get(a));

        return map;
    }

    public static Map alphe(char ch,Map<Integer,String> map){
        map.put(Integer.valueOf((int)ch-96),String.valueOf(ch));
        return map;
    }

    public static Map charMap(){
        Map<Integer,String> map = new HashMap<Integer, String>();
        String alphStr = "ab2cedfghijklmnopqrsduvwxyz";

        // 切割字符串 alphStr

        // 遍历切割后的数组

        // 循环调用alphe()方法建立map映射

        return map;
    }

    public static void test(char ch){
        System.out.println("字符:"+ch+"的位置:"+((int)ch-96));
    }
}

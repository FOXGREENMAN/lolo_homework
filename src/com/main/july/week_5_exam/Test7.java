package com.main.july.week_5_exam;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Test7 {
    public static void main(String[] args) {

       /* sadsad(1,"n");
        sadsad(2,"d");
        sadsad(3,"q");
        sadsad(4,"v");*/
//       test('a');
//        System.out.println((int)'a');

        charMap();
        test('c');


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
        Map<String,Integer> map = new HashMap<String,Integer>();

        String alphStr = "a,b,c,e,d,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,dasd";
        // 切割字符串 alphStr
        // 遍历切割后的数组
        // 循环调用alphe()方法建立map映射
            String[] param = alphStr.split(",");
            for (int i = 0; i < param.length; i++) {
                map.put(param[i],i+1);
//                System.out.println(map.get(i));
            if (map.containsKey(param[i])){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
                System.out.println(map.containsKey(param[i]));
         }



        for (String key:map.keySet()) {
//            System.out.println("map的key=" + key + ", map的value=" + map.get(key));
        }
        return map;
    }

    public static void test(char ch){
//       System.out.println("字符:"+ch+"的位置:"+((int)ch-96));
    }
}

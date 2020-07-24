package com.main.Yan.Jhe;

import java.util.*;

public class JheMap {
    public static void main(String[] args) {
        //Map是接口, HashMap是实现类
        Map<String,Integer> map = new HashMap<String, Integer>();
         map.put("b",1);
         map.put("e",2);
         map.put("e",2);
        System.out.println(map);
        System.out.println(map.get("b"));

        map.remove("c");//根据key移除键对值
        System.out.println(map);

        System.out.println(map.size());//获取map集合的长度


        System.out.println(map.containsKey("b"));//判断当前的map集合是否包含指定的key

        System.out.println(map.containsKey(10));//判断当前的map集合是否包含指定的value

//        map.clear();//清空集合


        Set<String> keya = map.keySet();//获取map集合的key的集合
        map.values();//获取集合的所有value值
        //遍历map集合,通过map.keySet();
        for (String key : keya){
            System.out.println("key:" + key + "         value:"+map.get(key));
        }


        //通过map.entrySet()遍历;
       Set<Map.Entry<String,Integer>> entrya = map.entrySet();
        for (Map.Entry<String,Integer> en : entrya){
            System.out.println("       key:" + en + "   value:"+en.getValue());
        }
        //TreeMap自然排序是字典排序
        Map<Integer,String> map3 = new TreeMap<Integer, String>();
        map3.put(4,"a");
        map3.put(2,"a");
        map3.put(3,"a");
        map3.put(5,"a");

        System.out.println(map);

        Map<String,String> map6 = new TreeMap<String, String>();
        map6.put("a","a");
        map6.put("c","c");
        map6.put("s","s");
        map6.put("e","e");
        map6.put("1","10");
        System.out.println(map6);

        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("1", "value1");
        map1.put("2", "value2");
        map1.put("3", "value3");

        //第一种：普遍使用，二次取值
        System.out.println("通过Map:keySet遍历key和value :  ");
        for (String key : map1.keySet()){
            System.out.println("key= "+ key + " and value= " + map1.get(key));
        }

        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map1.values()) {
            System.out.println("value= " + v);
        }

    }


}

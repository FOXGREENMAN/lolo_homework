package com.main.Yan.Jhe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JheSet {
    public static  void main(String[] args){
        Set set = new HashSet();
        Set<Object> set3 = new HashSet<Object>();//Obj类型的泛型集合


        /**
         *  //添加元素
         *         set.add(1);
         *         set.add("a");
         *         System.out.println(set);
         *
         *         //移除元素
         *         set.remove(1);
         *         System.out.println(set);
         *         //判断是否包含元素
         *         System.out.println(set.contains(1));
         *
         *         //清空元素
         *         set.clear();
         *         System.out.println(set);
         */


        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("d"); //set集合的值是不重复的
        set.add(1);
        set.add(true);
        set.add(null);


        //使用迭代器遍历集合
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Object obj : set){//这个的意思是把set的每一个值取出来,赋值给Obj,  直到循环set的所有值
            System.out.println(obj);


        }
        System.out.println(set.size());

        //让集合只能存同样类型的对象,
        //使用泛型

        Set<String> set1 = new HashSet<String>();//指定String类型的泛型集合

        set1.add("sadsa");

    }
}

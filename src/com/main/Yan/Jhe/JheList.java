package com.main.Yan.Jhe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JheList {
    public static void main(String[] args) {
//        //List是接口
//        List<String> list = new ArrayList<String>();
////        ArrayList<String> list1 = new ArrayList<>();
//
//        list.add("a");//第一个, 索引下标是0
//        list.add("b");//第一个, 索引下标是1
//        list.add("c");//第一个, 索引下标是2
//        list.add("d");//第一个, 索引下标是3
//        list.add("d");
//        System.out.println(list);
//        System.out.println(list.get(3));//通过索引来访问指定位置的集合元素
//
//
//
//
//        list.add(1,"f");//在指定的下标索引插入数据
//        System.out.println(list);
//
//        List<String> list1 = new ArrayList<String>();
//        list1.add("123");
//        list1.add("456");
//
//        list.addAll(2,list1);//在指定索引下标的位置插入集合
//        System.out.println(list);
//
//        ;
//        System.out.println(list.indexOf("b"));//获取指定元素在集合中第一次出现的索引下标
//        System.out.println(list.lastIndexOf("b"));//获取指定元素在集合中最后一次出现的索引下标
//
//        list.remove(2);//根据索引下标删除
//        System.out.println(list);
//        list.remove("123");//根据元素内容删除
//        System.out.println(list);
//
//        list.set(1,"ff");//根据指定的索引下标修改元素
//        System.out.println(list);
//
//        //根据索引下标的起始位置来截取一段元素 来形成一个新的集合,元素索引截取的时候, 包含开始的索引不包含结束时的所有
//        List<String> list2 = list.subList(2,4);//取索引下标在大于等于2小于4的元素
//        System.out.println(list2);
//
//
//        System.out.println(list.size());//集合的长度



        List<String> list3 = new ArrayList<String>();
        list3.add("Hello");
        list3.add("world");
        list3.add("Hahahaha");
        //第一种遍历方法使用
        for (String str : list3){ //也可以改写 for(int i=0;i<list.size();i++) 这种形式
            System.out.println(str);
        }

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strings = new String[list3.size()];
        list3.toArray(strings);
        for (int i=0; i<strings.length; i++){
            System.out.println(strings[i]);
        }

        //第三种遍历 使用迭代器进行相关遍历
        Iterator<String> iterator = list3.iterator();
        while(iterator.hasNext()){ //判断下一个元素之后有值
            System.out.println(iterator.next());
        }
    }
    /**
     * 三种方法都是用来遍历ArrayList集合，第三种方法是采用迭代器的方法，该方法可以不用担心在遍历的过程中会超出集合的长度。
     */
}

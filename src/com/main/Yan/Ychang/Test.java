package com.main.Yan.Ychang;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void unllPointList(){
        //有new 就不会有空指针
        List<String> listA = new ArrayList<>();

        // 这个不会空指针, 即便是listA里面没有元素
        System.out.println(listA.remove("a"));

        listA = null;
        // 这样就会空指针, 因为他已经被赋值为null了, 再调用其方法就会空指针
        System.out.println(listA.remove("a"));

        List<String> listB = new ArrayList<>();

        listB.add("fox");

        listB = null;
        // 这样会空指针, 即便是已经向list里添加了元素, 但因为被赋值为null了, 所以会空指针
        System.out.println(listB.remove("fox"));
    }
}

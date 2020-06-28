package com.main.Yan.muke.List.Demo2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        Product product = new Product(4,"木糖醇",10);
        Product product1 = new Product(6,"洗发水",12);
        Product product2 = new Product(3,"热水壶",19);
        List list = new ArrayList(); // 创建集合
        list.add(product);
        list.add(product1);
        list.add(product2);
        System.out.println("*************** 商品信息 ***************");
        for (int i = 0; i < list.size(); i++) {
            // 循环遍历集合，输出集合元素
            Product product3 = (Product) list.get(i);
            System.out.println(product3);
        }
    }
    }


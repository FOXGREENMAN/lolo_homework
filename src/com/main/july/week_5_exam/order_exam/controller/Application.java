package com.main.july.week_5_exam.order_exam.controller;

import com.main.july.week_5_exam.order_exam.entity.A;
import com.main.july.week_5_exam.order_exam.entity.B;
import com.main.july.week_5_exam.order_exam.entity.Order;

import java.util.*;

public class Application {
    public static void main(String[] args) {
//        A  a= new A();
//        List<B> list =new ArrayList<>();
//        a.setList(list);
//        List<A> c = new ArrayList<>( );
//        c.add(a);
//        // 写法1
//        c.get(0).getList();
//
//        // 写法2
//        A aBean = c.get(0);
//        aBean.getList();


        OrderAct orderAct = new OrderAct();
        Map<String,String> paraMap = new Hashtable<String, String>();
        paraMap.put("price","12");
        paraMap.put("price","sadasd");
        paraMap.put("price","-123");
        paraMap.put("","");
        orderAct.createOrder(paraMap);
        for (String key:paraMap.keySet()) {
            System.out.println("map的key="+ key+", map的value="+paraMap.get(key));

        }




    }
}

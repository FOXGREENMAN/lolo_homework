package com.main.july.week_5_exam.order_exam.controller;

import com.main.july.week_5_exam.order_exam.dao.DatabaseHungry;
import com.main.july.week_5_exam.order_exam.entity.Order;
import com.main.july.week_5_exam.order_exam.entity.Trade;
import com.main.july.week_5_exam.order_exam.service.OrderService;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
public class Store {

    public static void main(String[] args) {
        Order order = new Order();
        Trade trade = new Trade();
        Map<Integer, Order> map = new Hashtable<Integer, Order>();
        Map<String, String> map1 = new Hashtable<String, String>();
        map1.put("price","23146");
        map1.put("volume","2");
        map1.put("side","Sell");
        create(map1);
    }


    public static void alphe(Order order) {

        Map<Long, Order> orderDb = DatabaseHungry.getInstance().dbMap;
        Long id = order.getOrderId();
        orderDb.put(id, order);
        if (orderDb.containsKey(id)) {
            System.out.println("存在");
            return;
        } else {
        }
    }


    public static  void create(Map<String,String> map){
        OrderService.order(map);

    }

    public static boolean delete(Long lin){
    Map<Long,Order> map = new Hashtable<Long, Order>();
    ;

    Order order = map.get(lin);
    byte status = order.getoStatus();
    if (status != 2){
        map.remove(lin);
    }else {
        System.out.println("错误");
        return false;
    }

        return true;
    }
}

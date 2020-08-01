package com.main.july.week_5_exam.order_exam.service;

import com.main.july.week_5_exam.order_exam.controller.Store;
import com.main.july.week_5_exam.order_exam.dao.DatabaseHungry;
import com.main.july.week_5_exam.order_exam.entity.Order;

import java.util.Map;

/**
 * Service层, 和dao交互接口/方法定义在这里
 *
 * Created by admin on 2020/7/30.
 */
public class OrderService {
    public static void order(Map<String,String> map) {
        Map<Long, Order> orderDb = DatabaseHungry.getInstance().dbMap;
        Order order = new Order();


//        Double fromString = new Double(a);

        // 生成订单ID
        Long orderId = System.currentTimeMillis();

        // 构建订单其他属性
        map.get("side");
        order.setSide(map.get("side"));
        String a = map.get("voulume");
        order.setVolume(Double.valueOf(a));

        // 存入数据库
        orderDb.put(orderId, order);
        Store.delete(orderId);
    }


}

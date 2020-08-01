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

    /**
     * 创建订单对象
     * @param paraMap
     * @return
     */
    public boolean createOrder(Map<String,String> paraMap){
        Order o = new Order();

        Long orderId = Long.valueOf(System.currentTimeMillis());
        o.setOrderId(orderId);
        o.setSide(paraMap.get("side"));
        o.setPrice(Double.valueOf(paraMap.get("price")));
        o.setPrice(Double.valueOf(paraMap.get("volume")));

        // 保存订单
        return saveOrder(o);
    }

    /**
     * 保存订单对象
     * @param order
     * @return
     */
    public boolean saveOrder(Order order){
        Map<Long, Order> orderDb = DatabaseHungry.getInstance().dbMap;

        // 订单已存在则不保存
        if(orderDb.containsKey(order.getOrderId())){
            System.out.println("订单对象已存在, 订单ID:"+order.getOrderId());
            return false;
        }
        orderDb.put(order.getOrderId(),order);
        return true;
    }

    /**
     * 删除订单方法
     * @param orderId
     * @return
     */
    public boolean delOrder(Long orderId){
        Map<Long, Order> orderDb = DatabaseHungry.getInstance().dbMap;

        if(!orderDb.containsKey(orderId)){
            System.out.println("订单对象不存在, 删除失败, 订单ID:" + orderId);
            return false;
        }
        orderDb.remove(orderId);
        return true;
    }

}

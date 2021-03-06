package com.main.july.week_5_exam.order_exam.dao;

import com.main.july.week_5_exam.order_exam.entity.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据库存储对象
 *
 * Created by admin on 2020/7/28.
 */
public class DatabaseHungry {

    private DatabaseHungry(){}

    private static DatabaseHungry data = new DatabaseHungry();

    // 存储数据对象, key为订单ID value为订单对象
    public Map<Long, Order> dbMap = new HashMap<>();


    /**
     * 获取数据存储对象方法
     *
     * @return 数据存储对象
     */
    public static DatabaseHungry getInstance(){
        return data;
    }

}

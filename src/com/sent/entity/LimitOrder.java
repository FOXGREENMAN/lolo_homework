package com.sent.entity;

import com.sent.service.Order;

public class LimitOrder extends Order {
    public  void createOrder(String symbol, Integer volume, Integer price){
        System.out.println(symbol+volume+price);
    }

}

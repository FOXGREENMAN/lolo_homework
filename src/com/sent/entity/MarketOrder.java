package com.sent.entity;

import com.sent.service.Order;

public class MarketOrder extends Order {

    public  void createOrder(String symbol, Integer volume, Integer price){
        if (price != 0){
            System.out.println("错误");
        }
        System.out.println(symbol+volume+price);
    }

}

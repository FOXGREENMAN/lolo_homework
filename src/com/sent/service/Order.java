package com.sent.service;

public abstract class Order {
    private String symbol;
    private Integer volume;
    private Integer price;

    public abstract void createOrder(String symbol, Integer volume, Integer price);

}

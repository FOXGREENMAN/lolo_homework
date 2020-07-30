package com.main.july.week_5_exam.order_exam.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    // 订单ID
    private Long orderId ;

    // 价格
    private Double price;

    // 数量
    private Double volume;

    // 买卖单方向, "SELL"为买单, "BUY"为卖单
    private String side;

    // 订单状态 0 初始订单, 1 新订单, 2 完全成交订单, 6 异常单;
    private byte oStatus;

    //成交记录列表
    private List<Trade> tradeList = new ArrayList<Trade>();

    // 创建时间
    private  Date ctime;

    //更新时间
    private  Date mtime;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public byte getoStatus() {
        return oStatus;
    }

    public void setoStatus(byte oStatus) {
        this.oStatus = oStatus;
    }

    public List<Trade> getTradeList() {
        return tradeList;
    }

    public void setTradeList(List<Trade> tradeList) {
        this.tradeList = tradeList;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }
}

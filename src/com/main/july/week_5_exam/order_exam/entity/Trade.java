package com.main.july.week_5_exam.order_exam.entity;

import java.util.Date;

public class Trade  {
    // 成交记录ID
    private Long tradeId;

    // 价格
    private Double price;

    // 数量
    private Double volume;

    // 创建时间
    private  Date ctime;

    //更新时间
    private  Date mtime;


    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
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

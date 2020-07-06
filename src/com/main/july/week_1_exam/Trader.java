package com.main.july.week_1_exam;

import java.math.BigDecimal;
import java.util.Date;

public class Trader extends  Order {
    private BigDecimal price;
    private BigDecimal volume;
    private BigDecimal amount;
    private  char tStatus;
    private Date ctime;
    private Date mtime;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public char gettStatus() {
        return tStatus;
    }

    public void settStatus(char tStatus) {
        this.tStatus = tStatus;
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

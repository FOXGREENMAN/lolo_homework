package com.account;

import java.math.BigDecimal;

public class Account {

    private String type;
    private BigDecimal balance;
    private String uid;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Account{" +
                "type='" + type + '\'' +
                ", balance=" + balance +
                ", uid='" + uid + '\'' +
                '}';
    }
}

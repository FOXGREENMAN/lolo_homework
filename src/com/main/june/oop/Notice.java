package com.main.june.oop;

import java.util.Date;

class Notice extends Articles {

    private Date validTime;

    public Notice(){

    }

    public Date getValidTime() {
        return validTime;
    }

    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }
}

package com.main.june.oop;

import java.util.Date;

class News extends Articles {
    private Date createTime;

    private  String reporter;

    public  News(){

    }
    public  News(String reporter){
        this.reporter = reporter;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = new Date();
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }
}

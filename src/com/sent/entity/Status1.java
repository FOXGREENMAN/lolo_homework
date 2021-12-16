package com.sent.entity;

public enum Status1 {

    LIMIT("LIMIT", "限价"),
    MARKER("MARKER", "市价")
    ;

    public String value;
    public String desc;

    Status1(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }


}

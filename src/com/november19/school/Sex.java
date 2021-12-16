package com.november19.school;

public enum Sex {
    Nan(Byte.valueOf("1"),"男"),
    Nv(Byte.valueOf("2"),"女");

    private byte type;
    private String value;

    Sex(byte type, String value){
        this.type = type;
        this.value = value;
    }

    public Byte getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}

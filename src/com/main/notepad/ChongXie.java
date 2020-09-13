package com.main.notepad;

public class ChongXie extends ChongXieObj{

    public String chongXieStr(String str){
        Long nowTime = System.currentTimeMillis();
        return str + "chongXie" + nowTime;
    }
}

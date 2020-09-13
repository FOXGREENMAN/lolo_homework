package com.main.notepad;

public class ChongXieB extends ChongXieObj{

    public String notChongXieStr(String str){
        Long nowTime = System.currentTimeMillis();

        return str + "chongXie" + nowTime;
    }
}

package com.november15;

public class UserA {
    UserA(){

    }
    public String str(Integer i){
        System.out.println("UserA反射_"+i);
        return "UserA反射";
    }


    private void str(){
        System.out.println("UserA反射_NOTparams");

    }


}

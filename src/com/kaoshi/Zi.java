package com.kaoshi;

import java.util.Objects;

public class Zi  extends Fu{
    Zi() {
        super.zEn();
    }
    public  void zEn(){
        System.out.println("这个是子类");
    }




    public void checkParams(String ... str){
        if (Objects.isNull(str)){
            throw new NullPointerException("参数为空");
        }

    }

    protected  void onE(){

    }

}

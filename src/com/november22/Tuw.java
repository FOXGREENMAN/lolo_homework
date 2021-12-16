package com.november22;

import java.util.Objects;

public class Tuw {
    private Tuw(){}

    static Tuw tuw ;

    public static Tuw getTuw(){
        if (Objects.isNull(tuw)){
            tuw = new Tuw();
        }
        return tuw;
    }
}

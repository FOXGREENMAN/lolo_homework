package com.november15.pattern;

import java.util.Objects;

public class Lan {
    //懒汉
    private Lan(){}

    static Lan lan;

    public static Lan getLan(){
        if(Objects.isNull(lan)){
            lan = new Lan();
        }
        return lan;
    }
}

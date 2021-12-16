package com.november12.single;

import java.util.Objects;

public class Lazy {
    private Lazy(){}

    static Lazy lazy;

    public static Lazy getLazy(){
        if (Objects.isNull(lazy)){
            lazy = new Lazy();
        }
        return lazy;
    }
}

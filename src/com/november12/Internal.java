package com.november12;

public class Internal {
    static Internal internal = new Internal();
    public static Internal demo(){

        return internal;
    }

    private Internal(){

    }

}

package com.november15.pattern;

public class Ehan {
    //俄汉
    private Ehan(){}

    static Ehan ehan = new Ehan();

    public static Ehan getEhan(){
        return ehan;
    }
}

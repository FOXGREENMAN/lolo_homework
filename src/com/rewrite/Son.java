package com.rewrite;

public class Son extends Father{

    public void A() {
        System.out.println("rewriteA");
    }


    public void B() {
        System.out.println("rewriteB");
    }


    public void C(String food) {
        System.out.println("rewriteC");
        System.out.println("rewrite"+food);
    }


    public String ReturnText(){


        return "1";
    }

}

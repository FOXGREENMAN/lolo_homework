package com.rewrite;

public class Father {

    //公开
    public void A(){
        System.out.println("error");
        throw new RuntimeException("入参不能大于五");
    }

    //默认
    void B(){
        System.out.println("B");
    }

    //保护
    protected void C(String food){
        System.out.println("C");
    }

    //私有
    private void D(){
        System.out.println("D");
    }

    //用代码验证返回的类型必须与被重写的方法的返回类型相同
    public String ReturnText(){

        return "1";
    }
}

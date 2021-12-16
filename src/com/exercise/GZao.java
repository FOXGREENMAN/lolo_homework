package com.exercise;

public class GZao {

    //2. 构造方法
    //2.1定义一个类, 有一个空参的构造方法,输出一行语句"类被创建了". 修饰为私有方法; 有一个公有的静态方法, 返回这个类的对象本身(new 出来那种);\

    private String str;

    private GZao(){
        System.out.println("类被创建了");
    }

    public static GZao openFang(){
        GZao gzao = new GZao();
        return gzao;
    }

    public static void main(String[] args) {
        GZao gZao = new GZao();

        boolean b =  -1 >= 0;
        System.out.println(b);
    }

    public String getStr(){
        String str = "1";
        return str;
    }
}


package com.main.notepad;

public class ChongZai {

    public static void main(String[] args) {

    }

    /**
     * 演示重载 1
     * @param str
     * @return
     */
    public static String chongZai(String str){
        return str + "chongZai";
    }

    // 不允许有同名方法, 否正编译失败
   /* public static String chongZai(String str){
        return str + "chongZai";
    }*/

    // 返回值不作为方法的标识, 对java来说和上面的方法属于同名方法, 编译失败
   /* public static int chongZai(String str){

        char c = str.charAt(0);
        return (int)c;
    }*/

    /**
     * 演示重载 2
     *
     *  编译通过, 这个是重载方法
     *  它和演示重载 1 重载了
     *
     *  java通过参数列表判断方法是否重载, 同名方法参数列表不同, 视为重载方法
     * @param str
     * @param str1
     * @return
     */
    public static String chongZai(String str, String str1){

        return str + "chongZai" + str1;
    }
}

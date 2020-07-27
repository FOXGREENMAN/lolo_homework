package com.main.whiteBoard.functionDemo.entity;

/**
 * Created by admin on 2020/7/7.
 */
public class Fox {

    /**
     * 吼叫方法
     *
     * 功能: 打印狐狸的吼叫声
     *
     * 接收参数 无
     * 返回参数 无
     */
    public void roar(){
        System.out.println("汪汪汪");
    }

    /**
     * 做饭方法
     *
     * 功能: 接收食物字符串, 返回一个更新后的字符串
     *
     * @param food 食物
     * @return
     */
    public String cooking(String food){

        return "fox cooking " + food;
    }
}

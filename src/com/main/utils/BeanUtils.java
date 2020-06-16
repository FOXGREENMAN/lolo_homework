package com.main.utils;

import com.alibaba.fastjson.JSON;

/**
 * Created by admin on 2020/6/16.
 */
public class BeanUtils {

    /**
     * 打印对象
     * @param obj 需要打印的对象
     */
    public static void printBean(Object obj){
        System.out.println(JSON.toJSON(obj));
    }

}

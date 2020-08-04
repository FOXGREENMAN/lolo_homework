package com.main.july.week_5_exam.order_exam.controller;

import com.main.july.week_5_exam.order_exam.service.OrderService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Controller层
 *
 * 和前端交互接口定义在这里
 *
 * Created by admin on 2020/7/30.
 */
public class OrderAct {

    /**
     * 创建订单接口
     * @param paraMap 创建订单数据
     * @return
     */
    public boolean createOrder(Map<String,String> paraMap){

        OrderService service = new OrderService();


        Pattern pattern = Pattern.compile("-?[0-9]+(.[0-9]+)?");
        Matcher isNum = pattern.matcher((CharSequence) paraMap);
        if( !isNum.matches() ){
            return false;
        }else{
            System.out.println("成功");
        }

        boolean isSucc = service.createOrder(paraMap);

        return isSucc;
    }


    /**
     * 删除订单接口
     * @param orderId 订单ID
     * @return
     */
    public boolean delOrder(Long orderId){
        OrderService service = new OrderService();

        boolean isSucc = service.delOrder(orderId);

        return isSucc;
    }

}

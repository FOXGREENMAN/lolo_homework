package com.sent;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PoDemo {
    //面向过程
    static String symbol;
    static BigDecimal volum;
    static BigDecimal price;
    static Date ctime;
    static Byte status;


    public static void main(String[] args) {
        symbol = "BTCUSDT";
        volum = BigDecimal.valueOf(2);
        price = BigDecimal.valueOf(1);
        ctime = new Date();
        status = 1;

        Map<String,Map<String,Object>> db = new HashMap<>();
        //x下单 把上面的参数存入数据库
        Map<String,Object> o1 = new HashMap<>();
        o1.put("symbol",symbol);
        o1.put("volum",volum);
        o1.put("price",price);
        o1.put("ctime",ctime);
        o1.put("status",1);
        db.put("202110031856",o1);

        //撮合改变订单状态
        o1.put("sataus",2);



        Map<String,Object> o2 = new HashMap<>();
        o2.put("symbol",symbol);
        o2.put("volum",volum);
        o2.put("price",price);
        o2.put("ctime",ctime);
        o2.put("status",1);

        db.put("202110031856",o2);

        //撮合改变订单状态
        o2.put("sataus",2);
    }

}

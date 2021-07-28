package com.main;

import com.sun.deploy.util.StringUtils;
import com.sun.xml.internal.ws.api.ha.HaInfo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        BigDecimal  price= new BigDecimal("46.72");
//        BigDecimal account = new BigDecimal("0.000000000000");
//        BigDecimal account = BigDecimal.ZERO.setScale(12);
//        account.setScale(12,1);
//        System.out.println(account);
//        System.out.println(account.toPlainString());


//        System.out.println(price.compareTo(account));
//        if (price.compareTo(account) > 0){
//            System.out.println("holle word");
//        }


        String count ="今天晚上吃%s, 喝%s 看JOJO";
        String a = "面";
        String b = "汤";

        System.out.println(String.format(count,b,a));

}
}

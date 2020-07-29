package com.main.july.week_5_exam;

import com.main.june.firstDay.User;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {


        dsarw("a,p,p,l,e");

    }

    public static void dsarw(String enign) {
        Map<String, Integer> map = new Hashtable<String, Integer>();
        String alphStr = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        String[] strArr = alphStr.split("\\,");
        for (int i = 0; i < strArr.length; ++i) {
            map.put(strArr[i], i + 1);
        }
        String[] strBrr = enign.split("\\,");
        for (int i = 0; i < strBrr.length; ++i) {
             map.get(strBrr[i]);


            int ousn = 0;
            int[] iArrc = new int[]{map.get(strBrr[i])};
            for (int k = 0; k < iArrc.length; k++) {
                ousn+= iArrc[k];
                System.out.println(ousn);
            }
        }


//        for (String key:map.keySet()) {
//            System.out.println("map的key=" + key + ", map的value=" + map.get(key));
//        }

//        System.out.println(map.get(enign))
    }

}
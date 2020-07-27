package com.main.whiteBoard.arrayList;

import com.main.june.oop.answer.entity.News;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        Integer[] iArrA = new Integer[]{3,1,4,2,5,9,7,6};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(iArrA));
        paixu(list);
//        System.out.println(list);

    }

    public static void paixu(List<Integer> list){
//        for (int i = 0; i < list.size(); i++) {
//            int s = list.get(i);
//            System.out.println(list.get(i));
//        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size(); j++) {
//                System.out.println(list.get(j)+"_"+list.get(i));
//            }
        }
        System.out.println(list);
//        System.out.println(list);
    }
}

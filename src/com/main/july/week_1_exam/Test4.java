package com.main.july.week_1_exam;

import sun.misc.SoftCache;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Integer[] iArrA = new Integer[]{3,1,4,2,5,9,7,6};
        Integer[] iArrB = new Integer[]{1,8,6};

        Integer[] iArrC = new Integer[]{1,5,5,7,3};


        List<Integer> list = new ArrayList<Integer>(Arrays.asList(iArrA));
        List<Integer> listB = new ArrayList<Integer>(Arrays.asList(iArrB));
        list.addAll(listB);

        List<Integer> resultList = new ArrayList<>();
        boolean falg = false;

        for (int i = 0; i < list.size(); i++) {
            if(!(resultList.indexOf(list.get(i)) > 0)){
                resultList.add(list.get(i));
            }
        }
//        for (int i = 0; i< list.size();i++){
//            if (!(resultList.indexOf(list.get(i)) >0){
//
//            }
//        }

        System.out.println(resultList);





//        List<Integer> list = new ArrayList<Integer>(iArrA,iArrB);
//        Arrays.sort(iArrA);
//        for (int i=0; i<iArrA.length; i++) {
//            if(!list.contains(iArrA[i])) {
//                list.add(iArrA[i]);
//            }
//        }
//        System.out.println("去除重复后"+list);


    }
}

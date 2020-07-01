package com.main.Yan;

public class shuzu {
    public  static void main(String[] args){
        int[] iArry = new int[3];

        int[] iArry_1 = new int[]{1,2,3};

        int i = iArry_1[0];


        iArry_1[0] = 6;

        for (int j =0;j <iArry_1.length; j++){
            System.out.println(iArry_1[i]);
        }
    }
}

package com.main.july.week_4_exam;

import com.main.june.oop.answer.entity.News;
import com.main.utils.BeanUtils;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] sii = {1, 2, 3, 4, 5, 6};
        bianli(sii);
        bianlitwo(sii);
        bianlitwow(sii);
    }

    public static void bianli(int[] sii) {
        int[] arr = sii;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "+++++++++++++++++++++++++++++++++++++++++++++++++++");
            arr[i] = arr[i] + 1;
            System.out.println("----------------------------" + arr[i]);

        }
    }
    public static void bianlitwo(int[] scc) {
        int[] arr = scc;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "+++++++++++++++++++++++++++++++++++++++++++++++++++");
            arr[i] = arr[i]++;
            System.out.println("----------------------------" + arr[i]);

        }
    }
    public static void bianlitwow(int[] scc) {
        int[] arr = scc;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "+++++++++++++++++++++++++++++++++++++++++++++++++++");
            arr[i] = arr[i]+=1;
            System.out.println("----------------------------" + arr[i]);

        }
    }
    }




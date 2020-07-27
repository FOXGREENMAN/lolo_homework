package com.main.whiteBoard.arrayList;

import com.main.utils.BeanUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        swap(a,1,3);
        BeanUtils.printBean(a);
    }
    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}











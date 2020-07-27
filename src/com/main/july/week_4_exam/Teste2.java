package com.main.july.week_4_exam;

public class Teste2 {
    public static void main(String[] args) {
        int[] sii = {1, 2, 3, 4, 5, 6};
        bianli(sii);
        bianliw(sii);
    }
    public static void bianli(int[] sii) {
        int[] arr = sii;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "+++++++++++++++++++++++++++++++++++++++++++++++++++");
            arr[i] = arr[i] +2;
            System.out.println("----------------------------" + arr[i]);

        }
    }
    public static void bianliw(int[] sii) {
        int[] arr = sii;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "+++++++++++++++++++++++++++++++++++++++++++++++++++");
            arr[i] = arr[i] +=2;
            System.out.println("----------------------------" + arr[i]);

        }
    }
}

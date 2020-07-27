package com.main.july.week_4_exam;

public class Test6 {
    public static void main(String[] args) {
            long a = 123456;
            int c = 2;
            int b = 3;
            shuziwei(a,b,c);
    }





    public static int shuziwei(long a, int b, int c){
        String s =a+"";
        String ins= s.substring(2);
        System.out.println(ins);
        int sdasd =Integer.parseInt(ins);
        int sad = sdasd/c;


        return sad;
    }

}

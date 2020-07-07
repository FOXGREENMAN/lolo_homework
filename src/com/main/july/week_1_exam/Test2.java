package com.main.july.week_1_exam;

public class Test2 {
    public static void main(String[] args) {
            Szi szi = new Szi(1,2,"-");
            Test2 test2 = new Test2();
            test2.jiafa(szi);
            test2.sfa(szi);
            test2.xianshi("+");
            test2.jsq(szi);
    }

public void jiafa(Szi siz){
    int i =siz.getI();
    int c = siz.getI();
    int s = i+c;
    System.out.println(s);
}

public void sfa(Szi siz){
    int i =siz.getI();
    int c = siz.getI();
    int s = i*c;
    System.out.println(s);
}

    public void xianshi(String s){
        String i =s;
        switch (i){
            case "+":
                System.out.println("加法");
                break;
            case "-":
                System.out.println("加法");
                break;
            case "*":
                System.out.println("加法");
                break;
            case "/":
                System.out.println("加法");
                break;
                default:
                    System.out.println("错误");
                    break;
        }


    }
    public int jsq(Szi szi){
        int i = szi.getI();
        int j = szi.getJ();
        int c =0;
        String str = szi.getStr();
        switch (str){
            case "+":
               c= i +j;
                System.out.println(c);
                break;
            case "-":
                c= i -j;
                System.out.println(c);
                break;
            case "*":
                c= i *j;
                System.out.println(c);
                break;
            case "/":
                c= i /j;
                System.out.println(c);
                break;
        }
       return c;
    }

}
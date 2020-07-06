package com.main.july.week_1_exam;

public class Test {

    public static void main(String[] args) {
    }

public String bit(boolean i,boolean j){
    if (i == j) {
        System.out.println("SUCC");
    }else{
        System.out.println("FAIL");
    }

    return null;
}

public String sin(int type){
    int sd = type;
        switch (sd){
            case 1:
                System.out.println("限价币币订单");
                break;
            case 2:
                System.out.println("市价币币单");
                break;
            case 3:
                System.out.println("限价杠杆订单");
                break;
            case 4:
                System.out.println("市价杠杆订单");
                break;
            case 5:
                System.out.println("FAIL");
                break;

        }
        return null;
}

}

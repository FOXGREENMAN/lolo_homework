package com.main.july.week_1_exam;

public class Test {

    public static void main(String[] args) {
        Test test = new  Test();
        byte a =1;
        short s = 1;
        Order order = new Order(1,a,s,"ASE",'a',true,123);
        order.setOpen(true);
        test.bit(order);
        test.sin(order);

    }
public String bit(Order order){
    boolean s = false;
    boolean i =order.isOpen();
    if (i == s) {
        System.out.println("SUCC");
        return "Succ";
    }else{
        System.out.println("FAIL");
        return "FAIL";
    }

}
public String sin(Order order){
   byte sd = order.getType();
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
            default:
                System.out.println("FAIL");
                break;
        }
        return "Succ";
}

}

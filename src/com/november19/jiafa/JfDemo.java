package com.november19.jiafa;

public class JfDemo {
    private static Integer count = 0;

    public static void main(String[] args) {
        CanS canS = new CanS();
        canS.start();
        CanS canS1 = new CanS();
        canS1.start();
        while (true){
            if (count >=100){
                break;
            }
            Integer j = canS.jiaFa(count);
            System.out.println(canS.getName()+"都加了"+(j-count));
            Integer l = j;
            System.out.println(canS1.getName()+"都加了"+(j-count));
            count = canS.jiaFa(l);
            System.out.println(count);


        }
    }
}

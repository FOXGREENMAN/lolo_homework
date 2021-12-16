package com.rewrite;

public class Exception {
     public void excDemo(int i){
         int il = i/ 0;
         System.out.println(il);

     }

     public  Integer add(Integer ing,Integer eq){
         if (ing.equals(0)){
             return null;
         }
         return ing+eq;
     }

     public String  add(Integer str){
        if (str > 5 ) {
            System.out.println("error");
            throw new RuntimeException("入参不能大于五");
        }
        return "入参小于五";
     }

}

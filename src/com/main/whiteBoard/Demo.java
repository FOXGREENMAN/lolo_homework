package com.main.whiteBoard;

import java.util.Map;

/**
 * Created by admin on 2020/6/5.
 */
public class Demo {
    public static void main(String[] args) {



    }

    public static void char2Int(char ch){
        System.out.println((int)ch-96);
    }

    public static void something(){
         /* // 这里定义一个字符串;
        String resultStr = "lolo_";

        // 这里定义一个新的字符串, 调用getStr方法, 用新的字符串接收方法的返回值;
        String newResult = getStr(resultStr);

        // 这里打印新的字符串接收的东西;
        System.out.println(newResult);*/
        pool();
    }

    // 这个方法接收一个字符串, 然后在这个字符串的末尾加上FOXMAN, 返回给调用者; 返回的也是一个字符串;
    public static String getStr(String str){

        str = str + "FOXMAN";

        return str;
    }

    public static void print99(){

    }

    public static void pool(){

        int[] arr = new int[]{1,3,5,7,9};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum +=arr[i];

        }
        System.out.println(sum);
    }

    public static void pool(int a){

        char[] c = new char[5];

        for (int i = 0/*第一个分号, 代表循环的起始条件*/; i < c.length/*第二个分号, 代表循环执行的依据,既这个条件成立,循环才执行*/; i++ /*最后一个标识循环执行完一次后, 触发的操作*/) {
            // do somthing
        }

    }


    public static void test(){
        String[] pidArr = {"276150","276150","276150","276150","282353","279237","283036","283036","283036","283036","288009","288009","283053","283053","283053","283053","283177","283177","283177","283557","283557","279888","279888","284159","284378","283706"};
        String[] uidArr = {"276652","279959","282353","279237","283036","288009","282392","282736","280942","283053","288010","288011","280526","279265","283177","283557","279888","284159","284378","283762","288136","283706","278461","284237","287586","283704"};
    }


    public Map<String,String> getPath(String[] pidArr, String[] uidArr){



        return null;
    }

    public String getPath(String rsultStr,String idStr, String[] pidArr, String[] uidArr){

        for (int i = 0; i < pidArr.length; i++) {

        }
        for (int j = 0; j < uidArr.length; j++) {

        }
        return rsultStr;
    }

    public static void instanceTest(){

        Fox fox = new Fox();
        FoxHasDefault foxH = new FoxHasDefault();

        // 这行输出没有默认值的对象
        System.out.println(fox);

        // 这行输出有默认值的对象
        System.out.println(foxH);

        // 这样可以创建没有默认值的对象, 且给它赋值;
        Fox fox_setInfo = new Fox(19,"FOXgreenMan");
        System.out.println(fox_setInfo);
    }

    public static void annotaion(){

//         这是单行注释
//
//        int i = 233;
//        String strI = i + "";
//
//        String strII = String.valueOf(i);
//
//        System.out.println(strI);
//
//        System.out.println(strII);

    }

    public static void arry(){

        // 创建数组,指定长度不指定内容(隐示初始化);
        int[] iArry = new int[3];

        // 创建数组,指定内容(显示初始化);
        int[] iArry_1 = new int[]{1,2,3};

        // 获取数组元素
        int i =iArry_1[0];

        // 给数组元素赋值
        iArry_1[0] = 6;

        // 遍历数组
        for (int j = iArry_1.length-1; j > iArry_1.length; j--) {
            System.out.println(iArry_1[i]);
        }

    }

    public  static  void  equa(){
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "ABC";
        System.out.println(str1.equals(str2)); // 输出 true
        System.out.println(str1.equals(str3)); // 输出 false

    }

}

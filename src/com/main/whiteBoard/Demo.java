package com.main.whiteBoard;

import java.util.Map;

/**
 * Created by admin on 2020/6/5.
 */
public class Demo {
    public static void main(String[] args) {

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
}

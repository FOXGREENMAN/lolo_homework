package com.november15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FansDemo {


    public static void main(String[] args) throws Exception {
        arkOen();
        arkTwo();

    }

    public static void f()throws IllegalAccessException, InstantiationException {
        Class <User> userClass = User.class;
        User u = userClass.newInstance();
        System.out.println(u);
    }

    public static void f_a() throws Exception {

        Class classzz = Class.forName("com.november15.UserA");
        Constructor constructor = classzz.getConstructor();
        Object o = constructor.newInstance();
        Method method = classzz.getMethod("str",Integer.class);
        method.invoke(o,1);


    }

    public static void f_b() throws Exception {
        //通过class类里面的
        Class classzz = Class.forName("com.november15.UserA");
        Constructor constructor = classzz.getConstructor();
        Object o = constructor.newInstance();
        Method method = classzz.getMethod("str");
        method.invoke(o);


    }

    public static void arkOen()throws Exception{
        Class c =Class.forName("com.november15.ArkOne");
        Method[] method = c.getMethods();
        for (int i = 0;i<method.length;i++){
            String methodName = method[i].getName();
            System.out.println(methodName);
        }
    }

    public static void arkTwo()throws Exception{
        Class c =Class.forName("com.november15.ArkOne");
        Field[] field = c.getFields();
        for (int i = 0; i < field.length; i++) {
            //类型
            Class<?> type = field[i].getType();
            System.out.println("类型="+type.getName() + "  属性名=" + field[i].getName());
        }
    }
}

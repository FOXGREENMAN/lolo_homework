package com.november24.dynamicPackage;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Karen implements InvocationHandler {
    private Object object;
    Karen(Object o){
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(object, args);
        if (method.getName().equals("fly")){
            System.out.println("蛛网超级滑翔");
        }
        if (method.getName().equals("shot")){
            System.out.println("发射蜘蛛手雷");
        }
        return invoke;
    }
}


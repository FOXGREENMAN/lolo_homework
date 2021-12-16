package com.november19;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class OpUtils {

    public static void main(String[] args) throws Exception{
        User user = new User();
        Map<String,Object> map = new HashMap<>();
        map.put("id","1");
        map.put("type","2");
        map.put("sex",1);
        map.put("age","4");
        map.put("ona","5");
        System.out.println(mapOp(map,user));
    }


    public static Map<String, Object> OpMap(Object obj, Integer integer) throws Exception {
        Map<String, Object> map = new HashMap<String,Object>();
        Class<?> aClass = obj.getClass();
        if (integer == 1) {
            //获取全部
            for (Field field : aClass.getDeclaredFields()) {
                field.setAccessible(true);//为true不会去检查Java权限控制private之类的,false就会检查权限控制
                String key = field.getName();
                Object value = field.get(obj);
                map.put(key, value);
            }
        }else {
            //获取公有
            for (Field field : aClass.getFields()) {
                String key = field.getName();
                Object value = field.get(obj);
                map.put(key, value);
            }
        }

//        Method[] method = aClass.getDeclaredMethods();
//        for (int i = 0;i<method.length;i++){
//            String methodName = method[i].getName();
//            System.out.println(methodName);
//        }
        return map;
    }

    public static Object mapOp(Map<String,Object> objectMap, Object  obj) throws Exception{
        Map<String, Object> map = new HashMap<String,Object>();
        Class<?> aClass = obj.getClass();
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();

        //获取全部
        for (Field field : aClass.getDeclaredFields()) {
            field.setAccessible(true);//为true不会去检查Java权限控制private之类的,false就会检查权限控制
            if(objectMap.containsKey(field.getName())){
                String key = field.getName();
                field.set(obj,objectMap.get(key));
            }
            continue;
        }
        return obj;
    }
}

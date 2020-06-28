package com.main.whiteBoard.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2020/6/28.
 */
public class Demo {

    public static void main(String[] args) {
        // 添加方法调用
//        listAdd();

        // 遍历方法调用
        // 先调用创建方法;
//        List<String> demoList = getStrList("a","b","c","foxman","lolo");
        // 再调用遍历方法
//        printStrList(demoList);

        // 删除方法调用
//        List<String> needDelList = getStrList("a","b","c","foxman","lolo");
//        delStrList("b",needDelList);

        // 更新方法调用
//        List<String> needUpList = getStrList("a","b","c","foxman","lolo");
//        updateStrList("foxman","foxman_loki",needUpList);

        /** ---- ArrayList的其他常用方法 ---- */
        List<String> demoOtherList = getStrList("a","b","c","foxman","lolo");

        // 获取元素在list中的角标
        int index = demoOtherList.indexOf("lolo");

        List<String> addList = getStrList("e","d","f");
        // 增量添加元素(添加集合)
        demoOtherList.addAll(addList);

        // 判断集合是否为空集合
        boolean isEmpty = demoOtherList.isEmpty();

        // 清空集合
        demoOtherList.clear();
    }

    /**
     * List添加演示方法, 添加的内容是固定的
     */
    public static void listAdd(){
        // 创建一个指定String数据类型的List集合
        List<String> myList = new ArrayList<>();

        // 添加元素
        myList.add("foxman");
        myList.add("lolo");
        myList.add("something");

        System.out.println("listAdd list内容:"+myList);
        try {
            /** 记住调用size()方法要确保list为显示创建, 否则会有空指针异常*/
            System.out.println("list长度:"+myList.size());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建List
     * @param strs 可变参数, 传入想要创建的字符串
     * @return
     */
    public static List<String> getStrList(String ... strs){
        // 创建一个指定String数据类型的List集合
        List<String> myList = new ArrayList<>();

        // 遍历传入参数
        for (int i = 0; i < strs.length; i++) {

            // 将遍历到的元素加入list
            myList.add(strs[i]);
        }
        return myList;
    }

    /**
     * 遍历list, 打印对应的角标和元素
     * @param myList
     */
    public static void printStrList(List<String> myList){

        System.out.println("printStrList list内容:"+myList);

        // 遍历list, 打印每个元素的角标和元素名称;
        for (int i = 0; i < myList.size(); i++) {

            // 获取list中的元素内容
            String item = myList.get(i);

            // 打印对应的角标和内容
            System.out.println("getStrListAndPrint 元素角标:["+ i +"], 元素内容["+ item +"]");
        }
    }

    /**
     * 删除list元素
     * @param delElement 需要删除的元素
     * @param myList 需要操作的list
     */
    public static void delStrList(String delElement, List<String> myList){

        System.out.println("delStrList 删除前 list:"+myList);

        // 遍历list
        // list != null && i < list.size() 是高级写法, 等同于在这个循环前写 if(list != null) {}
        for (int i = 0; myList != null && i < myList.size(); i++) {

            // 获取list中的元素内容
            String item = myList.get(i);

            // 对比需要删除的元素和list中端素, 相同则删除;
            if(delElement.equals(item)){
                // 按角标删除元素;
                myList.remove(i);
            }
        }
        System.out.println("delStrList 删除后 list:"+myList);
    }

    /**
     * 更新list中的元素
     * @param upOldElement list中原有的元素
     * @param upNewElement 需要替换成的新元素
     * @param myList 需要操作的list
     */
    public static void updateStrList(String upOldElement, String upNewElement, List<String> myList){

        System.out.println("updateStrList 更新前 list:"+myList);

        // 遍历list
        // list != null && i < list.size() 是高级写法, 等同于在这个循环前写 if(list != null) {}
        for (int i = 0; myList != null && i < myList.size(); i++) {

            // 获取list中的元素内容
            String item = myList.get(i);

            // 对比需要更新的元素和list中端素, 相同则更新;
            if(upOldElement.equals(item)){
                // 按角标更新元素;
                myList.set(i,upNewElement);
            }
        }
        System.out.println("delStrList 更新前 list:"+myList);
    }
}

package com.main.Yan.muke.List;

import java.util.ArrayList;
import java.util.List;

public class TestGenenc {
    /**
     * 带有泛型的---Course   List的类型属性
     */
    public List<Course> courses;
    public TestGenenc(){
        this.courses = new ArrayList<Course>();
    }

    /**
     * 测试添加
     */

    public void testAdd(){
        Course cr = new Course("1","德玛西亚");
        courses.add(cr);
        //泛型集合中不能添加规定的类型以外的对象
//        courses.add("萨达萨达萨达撒");
        Course cr1 = new Course("2","sdaw ");
        courses.add(cr1);

    }

    public  void testForEach(){
        for (Course cr: courses){
            System.out.println(cr.id+"."+cr.name);

        }
    }
    public static void main(String[] args){
        TestGenenc testGenenc = new TestGenenc();
        testGenenc.testAdd();
        testGenenc.testForEach();

    }
}



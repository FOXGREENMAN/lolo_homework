package com.main.Yan.muke.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    /**
     * 用于存放备选课程的List
     */

        public List coursesToSelect;

        public  ListTest(){
            this.coursesToSelect = new ArrayList();
        }


    /**
     * 用于往coursesToSelect 添加备选课程
     */
public  void  testAdd(){
            //创建一个课程对象通过调用add的方法 添加到备选课程List中
            //第一种添加元素方式
           Course course = new Course("1","数据结构");
           coursesToSelect.add(course);
           Course course1 = (Course) coursesToSelect.get(0);
           System.out.println("添加了课程"+course1.id+"."+course1.name);



           Course course2 = new Course("2","c语言");
           coursesToSelect.add(0,course2);
           Course course3 = (Course)coursesToSelect.get((1));
           System.out.println("添加了课程"+course2.id+"."+course2.name);



            //会抛出数组下标越界异常
//            Course course4 = new Course("1","test");
//            coursesToSelect.add(4,course4);


            //第二种添加元素方法
            Course[] courses = {new Course("3","离散数学"),new Course("4","汇编语言")};
            coursesToSelect.addAll(Arrays.asList(courses));
            Course course4 = (Course)coursesToSelect.get(2);
            Course course5 = (Course)coursesToSelect.get(3);
            System.out.println("添加了两门课程 :"+course4.id+"."+course4.name+"."+course5.id+"."+course5.name);


            //第三种添加元素方法
            Course[] courses1 = {new Course("5","高等数学"),new Course("6","大学英语")};
            coursesToSelect.addAll(Arrays.asList(courses1));
            Course course6 = (Course)coursesToSelect.get(4);
            Course course7 = (Course)coursesToSelect.get(5);
            System.out.println("添加了两门课程 :"+course6.id+"."+course6.name+"."+course7.id+"."+course7.name);




        }
    /**
     * 取List中的元素方法 查询
     */
    public void tetGet(){
        int size = coursesToSelect.size();
        System.out.println("有如下课程待选");
        for (int i = 0; i < size; i++){
            Course course = (Course) coursesToSelect.get(i);
            System.out.println("课程 :"+course.id+":"+course.name);

        }


    }
    /**
     * 通过迭代器遍历List
     */
public void testiIterator(){
    //通过迭代器
    Iterator iterator = coursesToSelect.iterator();
    System.out.println("有如下课程待选(通过迭代器访问");
    while (iterator.hasNext()){
        Course course = (Course)iterator.next();
        System.out.println("课程 :"+course.id+":"+course.name);
    }

}

    /**
     * 通过 for each方法访问集合元素
     * @param
     */
public  void  testForeach(){
    System.out.println("有如下课程待选(通过for each方法访问");
    for (Object obj:coursesToSelect){
        Course course = (Course) obj;
        System.out.println("课程 :"+course.id+":"+course.name);
    }
}

public void testType(){
    System.out.println("s萨达萨达萨达撒");
    coursesToSelect.add("是味道撒大撒大撒的撒但是啊");
}

    /**
     * 修改List中的元素
     * @param
     */

    public void testModify(){
        coursesToSelect.set(4,new Course("7","毛概"));
    }

    public static void main(String[] args){
            ListTest listTest = new ListTest();
            listTest.testAdd();
            listTest.testType();
            listTest.testForeach();
//            listTest.tetGet();
//            listTest.testiIterator();
//            listTest.testForeach();
//            listTest.testModify();
    }

    }

package com.main.Yan.Jhe;

import java.util.*;

public class JheListA {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("b");
        list.add("cd");
        list.add("ca");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("1");
        System.out.println(list);

        Collections.reverse(list);//反正list中的元素顺序
        System.out.println(list);

        Collections.shuffle(list);//随机list中的元素顺序
        System.out.println(list);

        Collections.sort(list);//字段升序排列list中的元素顺序
        System.out.println(list);


        System.out.println(Collections.frequency(list,"a"));//返回指定元素的次数

        Collections.replaceAll(list,"a","aa");//使用新值替换掉所有的旧值
        System.out.println(list);


//        Collections.swap(list,0,4);//将list集合中的i出元素和j处元素进行交换
//        System.out.println(list);
//        System.out.println(Collections.max(list));//根据元素自然顺序, 返回给集合中最大元素
//        System.out.println(Collections.min(list));//根据元素自然顺序, 返回给集合中最小元素


//
//        Student student = new Student(14,"张三");
//        Student student1 = new Student(12,"王五");
//        Student student2 = new Student(16,"李四");
//        Student student3 = new Student(29,"六四");
//
//        List<Student> students = new ArrayList<Student>(  );
//        students.add(student);
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        Student s = Collections.max(students,new Student());
//        System.out.println(s.name+","+s.age);
//        Student s1 = Collections.min(students,new Student());
//        System.out.println(s1.name+","+s1.age);
//        for (Student stu : students){
//
//            System.out.println(stu.name + "," +stu.age);
//            System.out.println("------------------------");
//
//            Collections.sort(students, new Student());
//            System.out.println(stu.name + "," +stu.age);
//        }

    }
}


class Student implements Comparator<Student>{
    int age;
    String name;
    public  Student(){

    }
    public Student(int age, String name){
        this.age = age;
        this.name = name;

    }




@Override
    public int compare(Student o1, Student o2){
    if (o1.age > o2.age){
        return 1;

    }else if (o1.age < o2.age){
        return -1;
    }else {
        return 0;
    }



}
    }
package com.main.Yan.Jhe;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class JheSetA {
    public static void  main(String[] args){
//        Set<Integer> set = new TreeSet<Integer>();
//        //TreeSet自然排序;
//        set.add(5);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        System.out.println(set);
//        set.remove(5);
//        set.contains(3);
////        set.clear();//清空集合
//
//        //使用迭代器遍历集合
//
//        Iterator<Integer> ic = set.iterator();
//        while (ic.hasNext()){
//            System.out.println(ic.next());
//        }
//
//        //for each迭代集合, 推荐使用这种
//        for (Integer i : set){
//            System.out.println(i);
//        }

        Person person = new Person("张三",19);
        Person person1 = new Person("李四",20);
        Person person2 = new Person("王五",16);
        Person person3 = new Person("六四",28);

        Set<Person> set1 = new TreeSet<Person>(new Person());
        set1.add(person);
        set1.add(person1);
        set1.add(person2);
        set1.add(person3);

        for (Person  p : set1){
            System.out.println(p.name+"    "+p.age);
        }
    }

}


class Person implements Comparator<Person>{
    int age;
    String name;
    public Person(){

    }
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compare(Person o1,Person o2){ //年龄正序排列
        if (o1.age >o2.age){
            return 1;
        }else if (o1.age < o2.age){
            return -1;

        }else
            return 0;
    }

//    @Override
//    public int compare1(Person o1,Person o2){ //年龄倒叙序排列
//        if (o1.age <o2.age){
//            return 1;
//        }else if (o1.age > o2.age){
//            return -1;
//
//        }else
//            return 0;
//    }
}

